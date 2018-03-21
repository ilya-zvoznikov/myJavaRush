package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> spisok = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            spisok.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            spisok.add(0, spisok.get(4));
            spisok.remove(5);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(spisok.get(i));
        }
    }
}
