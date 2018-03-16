package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        InputStream inStream = new FileInputStream(filename);
        while (inStream.available() > 0) {
            int data = inStream.read();
            System.out.print((char) data);
        }

        reader.close();
        inStream.close();

    }
}