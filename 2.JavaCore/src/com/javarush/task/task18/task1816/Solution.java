package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        String str = "abcdefghijklmnopqrstuvwxyz";
        String s = str + str.toUpperCase();
        char[] alphabet = new char[52];
        alphabet = s.toCharArray();
        int n = 0;
        while (fileInputStream.available() > 0) {
            char ch = (char) fileInputStream.read();
            for (char c : alphabet
                    ) {
                if (c == ch) {
                    n++;
                }
            }
        }
        System.out.println(n);
        fileInputStream.close();
    }
}
