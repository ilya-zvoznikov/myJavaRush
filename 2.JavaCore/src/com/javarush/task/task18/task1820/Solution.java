package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileWriter fileWriter2 = new FileWriter(file2);
        char b;
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        while (fileInputStream1.available() > 0) {
            b = (char) fileInputStream1.read();
            if (b != ' ') {
                s += b;
            } else {
                list.add(String.valueOf(Math.round(Double.parseDouble(s))));
                list.add(" ");
                s = "";
            }
        }
        if (s != "") {
            list.add(String.valueOf(Math.round(Double.parseDouble(s))));
        }
        for (int i = 0; i < list.size(); i++) {
            fileWriter2.write(list.get(i));
        }
        fileInputStream1.close();
        fileWriter2.close();
    }
}
