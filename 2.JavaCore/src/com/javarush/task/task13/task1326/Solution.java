package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerfile = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(readerfile.readLine())));

        readerfile.close();

        ArrayList<Integer> list = new ArrayList<Integer>();
        String stmp = "";

        while ((stmp = reader.readLine()) != null) {
            if ((Integer.parseInt(stmp)) % 2 == 0) {
                list.add(Integer.parseInt(stmp));
            }
        }
        reader.close();

        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }
    }
}