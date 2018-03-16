package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String str = "";
        while (fileReader.ready()) {
            str = fileReader.readLine();
            if (str.startsWith(args[0] + " ")) {
                break;
            }
        }
        System.out.println(str);
        reader.close();
        fileReader.close();
    }
}
