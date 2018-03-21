package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int nCount = 0;
        int spaceCount = 0;
        while (fileInputStream.available() > 0) {
            int ch = fileInputStream.read();
            if (ch == 32) {
                spaceCount++;
                nCount++;
            } else {
                nCount++;
            }
        }
        fileInputStream.close();
        double ff = spaceCount*100.0/nCount;
        System.out.printf("%.2f", ff);


    }
}
