package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter("d:/" + name));
        String s = null;
        while (true) {
            s = reader.readLine();
            writer.write(s);
            writer.newLine();
            if (s.equals("exit")) break;
        }
        reader.close();
        writer.close();
    }
}
