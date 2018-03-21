package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = bufferedReader.readLine();
        String secondFileName = bufferedReader.readLine();
        bufferedReader.close();
        bufferedReader = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondFileName));
        Pattern p = Pattern.compile("^\\W$");
        while (bufferedReader.ready()) {
            char sym = (char) bufferedReader.read();
            Matcher m = p.matcher(String.valueOf(sym));
            if (!m.matches()) bufferedWriter.write(sym);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
