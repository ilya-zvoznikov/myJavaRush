package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int[] dlina = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //считывание с клавиатуры 10 строк
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
            dlina[i] = s.length();
        }
        //поиск минимальной длины
        int min = dlina[0];
        for (int i = 1; i < 10; i++) {
            if (dlina[i] < min)
                min = dlina[i];
        }
        //поиск максимальной длины
        int max = dlina[0];
        for (int i = 1; i < 10; i++) {
            if (dlina[i] > max)
                max = dlina[i];
        }
        int j = 0;
        while (true) {
            if ((dlina[j] == min) || (dlina[j] == max)) {
                System.out.println(list.get(j));
                break;
            }
            else
                j++;
        }

    }
}
