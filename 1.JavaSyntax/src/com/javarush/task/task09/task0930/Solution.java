package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (String s : array
                ) {
            if (isNumber(s)) list2.add(Integer.parseInt(s));
            else list1.add(s);
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (isGreaterThan(list1.get(i), list1.get(j))) {
                    String a = list1.get(i);
                    String b = list1.get(j);
                    list1.set(j, a);
                    list1.set(i, b);
                }
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list2.size(); j++) {
                if (list2.get(i) < list2.get(j)) {
                    Integer a = list2.get(i);
                    Integer b = list2.get(j);
                    list2.set(j, a);
                    list2.set(i, b);
                }
            }
        }
        int n = 0;
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = list2.get(m).toString();
                m++;
            } else {
                array[i] = list1.get(n);
                n++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
