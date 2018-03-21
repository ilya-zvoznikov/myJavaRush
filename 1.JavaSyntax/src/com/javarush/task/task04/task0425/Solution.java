package com.javarush.task.task04.task0425;

/* 
Цель установлена!
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

        if (a > 0) {
            if (b > 0)
                System.out.println(1);
            else
                System.out.println(4);
        }
        else {
            if (b > 0)
                System.out.println(2);
            else
                System.out.println(3);
        }

    }
}
