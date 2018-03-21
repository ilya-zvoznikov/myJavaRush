package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int b;
        while (inputStream.available() > 0) {
            b = inputStream.read();
            if (!map.containsKey(b)) {
                map.put(b, 1);
            } else {
                Integer v = map.get(b);
                v++;
                map.put(b, v);
            }
        }
        int j = 0;
        while (!map.containsKey(j)) {
            j++;
        }
        Integer min = map.get(j);

        for (Map.Entry<Integer, Integer> s : map.entrySet()
                ) {
            Integer v = s.getValue();
            min = (v < min) ? v : min;
        }
        for (Map.Entry<Integer, Integer> s : map.entrySet()
                ) {
            if (s.getValue() == min) System.out.print(s.getKey() + " ");
        }
        reader.close();
        inputStream.close();
    }
}
