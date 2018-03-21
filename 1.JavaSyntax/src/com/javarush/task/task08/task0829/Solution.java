package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of cities and families
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.put(city, family);
        }

        //read city
        String cityTitle = reader.readLine();

        for (HashMap.Entry<String, String> pair : addresses.entrySet()
             ) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (key.equals(cityTitle)) System.out.println(value);
        }
    }
}
