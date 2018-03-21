package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(reader.readLine());
        int a = inputStream.available() / 2;
        System.out.println(inputStream.available());
        System.out.println(a);
        while (inputStream.available() > a) {
            outputStream2.write(inputStream.read());
        }
        while (inputStream.available() > 0) {
            outputStream3.write(inputStream.read());
        }
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
