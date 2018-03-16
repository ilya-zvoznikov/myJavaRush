package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;


/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        load(fileInputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        /*BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        for (Map.Entry<String, String> pair : properties.entrySet()
                ) {
            bufferedWriter.write(pair.getKey() + " = " + pair.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();*/
        Properties pr = new Properties();
        for (Map.Entry<String, String> pair : properties.entrySet()
                ) {
            pr.setProperty(pair.getKey(), pair.getValue());
        }
        pr.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (bufferedReader.ready()) {
            String str = bufferedReader.readLine();
            String[] strArr = str.split("\\s?(:|=)\\s?", 2);
            properties.put(strArr[0], strArr[1]);
        }
        bufferedReader.close();*/
        Properties pr = new Properties();
        pr.load(inputStream);
        pr.forEach((x, y) -> {
            properties.put((String) x, (String) y);
        });
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        solution.save(new FileOutputStream("D:\\2.txt"));
    }
}
