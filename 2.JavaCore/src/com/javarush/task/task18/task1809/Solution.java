package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        int[] file = new int[inputStream.available()];
        int ii = 0;
        while (inputStream.available() > 0) {
            file[ii++] = inputStream.read();
        }
        for (int j = file.length - 1; j >= 0; j--) {
            outputStream.write(file[j]);
        }

        inputStream.close();
        outputStream.close();
    }
}
