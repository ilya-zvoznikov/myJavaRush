package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = bufferedReader.readLine();
        String secondFileName = bufferedReader.readLine();
        bufferedReader.close();
        FileReader fileReader = new FileReader(firstFileName);
        FileWriter fileWriter = new FileWriter(secondFileName);
        int i = 1;
        while (fileReader.ready()) {
            int ch = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write(ch);
            }
            i++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
