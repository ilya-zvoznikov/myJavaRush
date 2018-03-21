package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("мята"); //3
        list.add("кора"); //4
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        Integer i = 0;
        while (i < list.size()) {
            String x = list.get(i);

        if (x.contains("р") && !x.contains("л")) {
            list.remove(x);
        }
        else {
            if (!x.contains("р") && x.contains("л")) {
                list.add(i, x);
                i = i + 2;
            }
            else i++;
        }

        }
        return list;
        //return null;
    }
}