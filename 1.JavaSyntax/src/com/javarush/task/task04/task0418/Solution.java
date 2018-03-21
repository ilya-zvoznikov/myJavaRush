package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);

        if (a < b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}