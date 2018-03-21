package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrayBig = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrayBig.length; i++) {
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }
        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];
        for (int i = 0; i < arraySmall1.length; i++) {
            arraySmall1[i] = arrayBig[i];
        }
        for (int i = 0; i < arraySmall2.length; i++) {
            arraySmall2[i] = arrayBig[i+10];
            System.out.println(arraySmall2[i]);
        }

    }
}
