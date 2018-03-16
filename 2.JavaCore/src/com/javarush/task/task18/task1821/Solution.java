package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 128; i++) {
            Character ii = (char) i;
            map.put(ii, 0);
        }
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available() > 0) {
            Character b = (char) fileInputStream.read();
            /*for (Map.Entry<Character, Integer> pair : map.entrySet()
                    ) {
                Character key = pair.getKey();
                Integer value = pair.getValue();
                if (b.equals(key)) {
                    map.put(key, ++value);
                }
            }*/
            if (map.containsKey(b)) {
                Integer value = map.get(b);
                map.put(b, ++value);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>(map);
        /*for (Map.Entry<Character, Integer> pair : map2.entrySet()
                ) {
            if (pair.getValue() == 0) {
                map.remove(pair.getKey());
            }
        }*/
        for (int i = 0; i < map.size(); i++) {
            Character j = (char) i;
            if (map.get(j) != 0) {
                System.out.println(j + " " + map.get(j));
            }
        }
        fileInputStream.close();
    }
}
