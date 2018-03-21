package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sn1 = reader.readLine();
        int nn1 = Integer.parseInt(sn1);
        String sn2 = reader.readLine();
        int nn2 = Integer.parseInt(sn2);

        System.out.println(name + " получает " + nn1 + " через " + nn2 + " лет.");
    }
}
