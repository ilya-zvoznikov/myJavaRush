package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Составить цепочку слов
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
Вывести полученную строку на экран.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена


Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе getLine должен быть использован StringBuilder
3. Метод getLine должен возвращать пустую строку(пустой StringBuilder) в случае если ему не были переданы параметры(слова).
4. Все слова переданные в метод getLine должны быть включены в результирующую строку, если это возможно.
5. Вывод на экран должен соответствовать условию задачи.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "windows-1251"));
        String strFromFile = bufferedReader.readLine();
        bufferedReader.close();
        String[] words;
        if (strFromFile != null) {
            words = strFromFile.split("\\s+");
        } else words = null;
//        String[] words = "Киев Нью-Йорк Амстердам Вена Мельбурн".split("\\s+");


        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        try {
            StringBuilder resultMain = new StringBuilder();
            if (words == null) return resultMain;


            for (int j = 0; j < words.length; j++) {
                StringBuilder result = new StringBuilder();
                String[] strArr = new String[words.length];
                for (int i = 0; i < words.length; i++) {
                    strArr[i] = words[i];
                }
                result.append(strArr[j]);
                strArr[j] = null;
                while (true) {
                    int countNotNull = 0;
                    for (String s : strArr
                            ) {
                        if (s != null) countNotNull++;
                    }
                    for (int i = 0; i < strArr.length; i++) {
                        if ((strArr[i] != null) && (result.toString().toLowerCase().charAt(0) == strArr[i].toLowerCase().charAt(strArr[i].length() - 1))) {
                            result.insert(0, strArr[i] + " ");
                            strArr[i] = null;
                        }
                        if ((strArr[i] != null) && (result.toString().toLowerCase().charAt(result.toString().length() - 1) == strArr[i].toLowerCase().charAt(0))) {
                            result.append(" ").append(strArr[i]);
                            strArr[i] = null;
                        }
                    }
                    int countNotNull2 = 0;
                    for (String s : strArr
                            ) {
                        if (s != null) countNotNull2++;
                    }
                    if (countNotNull == countNotNull2) break;
                }
                if (result.length() > resultMain.length()) resultMain = new StringBuilder(result);
            }
            return resultMain;
        } catch (Exception e) {
            return new StringBuilder("");
        }
    }
}
