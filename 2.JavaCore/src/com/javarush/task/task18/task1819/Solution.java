package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        ArrayList<Integer> listFile = new ArrayList<>();
        while (fileInputStream1.available() > 0) {
            listFile.add(fileInputStream1.read());
        }
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        while (fileInputStream2.available() > 0) {
            fileOutputStream1.write(fileInputStream2.read());
        }
        for (int i = 0; i < listFile.size(); i++) {
            fileOutputStream1.write(listFile.get(i));
        }
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
