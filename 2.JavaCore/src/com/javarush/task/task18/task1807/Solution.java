package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int b;
        int i = 0;
        int code = 0b101100;
        while (inputStream.available() > 0) {
            b = inputStream.read();
            if (b == code) i++;
        }
        System.out.println(i);
        reader.close();
        inputStream.close();
    }
}
