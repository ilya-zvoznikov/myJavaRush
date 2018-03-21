package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String s1;
        String s2;

        if ((a > 0) && (a < 1000)) {

            if (a1.length() == 1)
                s2 = "однозначное";
            else {
                if (a1.length() == 2)
                    s2 = "двузначное";
                else
                    s2 = "трехзначное";
            }
            if (a % 2 == 0)
                s1 = "четное";
            else
                s1 = "нечетное";
            System.out.println(s1 + " " + s2 + " число");
        }

    }

}
