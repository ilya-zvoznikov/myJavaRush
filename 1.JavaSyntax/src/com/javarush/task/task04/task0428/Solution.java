package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        for (int i = 1; i <= 3; i++) {
            String a1 = reader.readLine();
            int a = Integer.parseInt(a1);
            if (a > 0)
                n++;
        }
        System.out.println(n);


    }
}
