package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int n = Integer.parseInt(n1);

        if (((n%4 == 0) && (n%100 != 0)) || (n%400 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}