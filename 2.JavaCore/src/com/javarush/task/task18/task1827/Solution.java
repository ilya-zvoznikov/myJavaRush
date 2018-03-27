package com.javarush.task.task18.task1827;

/* 
Прайсы
CrUD для таблицы внутри файла.
Считать с консоли имя файла для операций CrUD.

Программа запускается со следующим набором параметров:
-c productName price quantity

Значения параметров:
где id - 8 символов.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.
-c - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле.

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234


Требования:
1. Программа должна считать имя файла для операций CrUD с консоли.
2. При запуске программы без параметров список товаров должен остаться неизменным.
3. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
4. Товар должен иметь следующий id, после максимального, найденного в файле.
5. Форматирование новой строки товара должно четко совпадать с указанным в задании.
6. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> stringList = new ArrayList<>();
        while (fileReader.ready()) {
            String n = fileReader.readLine();
            if (!(n.equals(""))) {
                stringList.add(n);
            }
        }

        Integer maxId = 0;
        ArrayList<Integer> idList = new ArrayList<>();
        if (stringList.size() != 0) {
            for (String str : stringList
                    ) {
                String s = str.substring(0, 8).trim();
                idList.add(Integer.parseInt(s));
            }
            Collections.sort(idList);
            maxId = idList.get(idList.size() - 1);
        }


        LinkedHashMap<String, Integer> fieldMap = new LinkedHashMap<>();

        //id - 8 symbols
        fieldMap.put((++maxId).toString(), 8);
        //name - 30 symbols
        fieldMap.put(args[1], 30);
        //price - 8 symbols
        fieldMap.put(args[2], 8);
        //quantity - 4 symbols
        fieldMap.put(args[3], 4);

        ArrayList<String> strArrList = new ArrayList<>();

        for (HashMap.Entry<String, Integer> pair : fieldMap.entrySet()
                ) {
            String str = pair.getKey();
            int delta = pair.getValue() - str.length();
            if (delta > 0) {
                for (int i = 1; i <= delta; i++) {
                    str += " ";
                }
            } else if (delta < 0) {
                str = str.substring(0, str.length() + delta);
            }
            strArrList.add(str);
        }

        if (!(args.length == 0) && (args[0].equals("-c"))) {
            FileWriter fileWriter = new FileWriter(fileName, true);
            String s = strArrList.get(0) +
                    strArrList.get(1) +
                    strArrList.get(2) +
                    strArrList.get(3);
            fileWriter.append(s);
            fileWriter.append(System.lineSeparator());
            fileWriter.close();
        }
        fileReader.close();
    }
}

//198478 "Шорты пляжные черные с рисунком обычные" 173.00 17
///home/ilya/file1.txt
