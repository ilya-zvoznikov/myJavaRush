package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
//            String s = "";
            while (true) {
                String s = reader.readLine();
                if (s == null) break;
                else {
                    lines.add(s);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл на найден!");
        } catch (IOException e) {
            System.out.println("Файл пустой!");
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
