package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] a1 = new String[10];
        int[] a2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a1.length; i++) {
            a1[i] = reader.readLine();
            a2[i] = a1[i].length();
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
    }
}
