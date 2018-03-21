package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        int age1 = Integer.parseInt(age);
        if (age1 > 20)
            System.out.println("И 18-ти достаточно");
    }
}
