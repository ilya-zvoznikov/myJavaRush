package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] street = new int[15];
        int chet = 0, nechet = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < street.length; i++) {
            street[i] = Integer.parseInt(reader.readLine());
            if (i%2 == 0)
                chet = chet + street[i];
            else
                nechet = nechet + street[i];
        }
        //System.out.println("Четные " + chet);
        //System.out.println("Нечетные " + nechet);
        if (chet > nechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else {
            if (nechet > chet)
                System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
