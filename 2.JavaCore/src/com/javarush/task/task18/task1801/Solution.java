package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int max = 0;
        int b = 0;
        while (inputStream.available() > 0) {
            b = inputStream.read();
            max = (b > max) ? b : max;
        }
        System.out.println(max);
//        System.out.println(inputStream.available());
        inputStream.close();
        reader.close();
    }
}
