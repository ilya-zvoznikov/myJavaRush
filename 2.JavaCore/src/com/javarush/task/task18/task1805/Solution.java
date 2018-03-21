package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (fis.available() > 0) {
            list.add(fis.read());
        }
        Collections.sort(list);
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.print("\n");
        remd(list);
//        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        fis.close();
        reader.close();
    }

    public static void remd(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>(list);
        ArrayList<Integer> list3 = new ArrayList<>(list);
        for (Integer x : list2
                ) {
            list3.remove(x);
            for (Integer y : list3
                    ) {
                if (x.equals(y)) list.remove(y);
            }
            list3 = new ArrayList<>(list);
        }
    }
}
