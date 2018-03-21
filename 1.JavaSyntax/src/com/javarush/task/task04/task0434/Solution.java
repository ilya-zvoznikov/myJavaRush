package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i, j = 1;

        while (j <= 10) {
            i = 1;
            while (i < 10) {
                System.out.print(j*i + " ");
                i++;
            }
            System.out.println(j*i);
            j++;
        }

    }
}
