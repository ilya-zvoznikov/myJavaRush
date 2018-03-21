package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        String str = "";
        while (fileReader.ready()) {
            int ch = fileReader.read();
            str += String.valueOf((char) ch);
        }
        fileReader.close();
        String[] strArr = str.split("\\W");
//        System.out.println(str);
        int worldCount = 0;

        Pattern p = Pattern.compile("^[Ww][Oo][Rr][Ll][Dd]$");
        for (String s : strArr
                ) {
            Matcher m = p.matcher(s);
            if (m.matches()) worldCount++;
        }
        System.out.println(worldCount);
    }
}
