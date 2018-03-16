package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int n = 1;
        while (n < 11) {
            int i = 1;
            while (i < 11) {
                if (i < 10) {
                    System.out.print(n * i + " ");
                    i++;
                } else {
                    System.out.println(n * i);
                    i++;
                }
            }
            n++;
        }
    }
}
