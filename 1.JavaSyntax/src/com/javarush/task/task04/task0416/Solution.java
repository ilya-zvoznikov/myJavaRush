package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        double a = Double.parseDouble(n);
        if ((a%5 >= 0) && (a%5 < 3))
            System.out.println("зеленый");
        else {
            if ((a%5 >= 3) && (a%5 < 4))
                System.out.println("желтый");
            else
                System.out.println("красный");
        }
    }
}