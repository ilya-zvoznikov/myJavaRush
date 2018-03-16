package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.


Требования:
1. Программа НЕ должна считывать данные с клавиатуры.
2. Программа НЕ должна выводить данные на экран.
3. Программа должна записывать данные в файл.
4. Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "windows-1251"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"));

        while (bufferedReader.ready()) {
            String str = bufferedReader.readLine();
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
