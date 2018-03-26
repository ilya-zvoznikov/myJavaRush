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
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> stringList = new ArrayList<>();
        while (fileReader.ready()) {
            stringList.add(fileReader.readLine());
        }

        ArrayList<Integer> idList = new ArrayList<>();
        for (String str : stringList
                ) {
            String s = str.substring(0, 8).trim();
            idList.add(Integer.parseInt(s));
        }

        Collections.sort(idList);
        int maxId = idList.get(idList.size() - 1);

        if (!(args.length == 0) && (args[0].equals("-c"))) {
            FileWriter fileWriter = new FileWriter(fileName, true);
            String s = ++maxId + args[1] + args[2] + args[3];
            fileWriter.append(s);
            fileWriter.append(System.lineSeparator());
            fileWriter.close();
        }
        fileReader.close();
    }
}

//-c "Шорты пляжные черные с рисунко" "173.00  " "12  "
//198478  Шорты пляжные черные с рисунко173.00  17
///home/ilya/file1.txt
