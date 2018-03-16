package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listOfParts = new ArrayList<>();
        while (true) {
            String nameOfPart = reader.readLine();
            if (nameOfPart.equals("end")) {
                break;
            }
            listOfParts.add(nameOfPart);
        }
        Collections.sort(listOfParts);
        String fileName = listOfParts.get(0).replaceAll(".part1", "");
        BufferedWriter newFile = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < listOfParts.size(); i++) {
//            FileInputStream fileInputStream = new FileInputStream(listOfParts.get(i));
            BufferedReader fileReader = new BufferedReader(new FileReader(listOfParts.get(i)));
            while (fileReader.ready()) {
                newFile.write(fileReader.read());
            }
            fileReader.close();
        }
        newFile.close();

    }
}
