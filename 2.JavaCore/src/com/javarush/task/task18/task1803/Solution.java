package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
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
        Integer max = 0;
        for (Map.Entry<Integer, Integer> s : map.entrySet()
             ) {
            Integer v = s.getValue();
            max = (v > max) ? v : max;
        }
        for (Map.Entry<Integer, Integer> s : map.entrySet()
                ) {
            if (s.getValue() == max) System.out.print(s.getKey() + " ");
        }
        reader.close();
        inputStream.close();
    }
}
