package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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
        BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFileName));
        String string = "";
        while (fileReader.ready()) {
            string += (char) fileReader.read();
        }
        String[] strings = string.split("\\s");
        Pattern p = Pattern.compile("^\\d\\d*$");
        String str = "";
        for (String s : strings
                ) {
            Matcher m = p.matcher(s);
            if (m.matches()) str = str + s + " ";
        }
//        for (int i = 0; i < str.length(); i++) {
            fileWriter.write(str);
//        }
        fileReader.close();
        fileWriter.close();
    }
}
