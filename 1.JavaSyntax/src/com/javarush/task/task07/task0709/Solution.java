package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> spisok = new ArrayList<String>();
        int[] dlina = new int[5];
        //ArrayList min = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            spisok.add(s);
            dlina[i] = s.length();
//            System.out.println(dlina[i]);
        }
//        System.out.println(Collections.min(spisok));
        int min = dlina[0];
        for (int i = 1; i < 5; i++) {
            if (dlina[i] < min)
                min = dlina[i];
        }
        for (int i = 0; i < 5; i++) {
            if (dlina[i] == min)
                System.out.println(spisok.get(i));
        }




    }
}
