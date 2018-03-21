package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet()
                ) {
            Character key = pair.getKey();
//            Integer value = pair.getValue();
            Integer value = 0;
            for (String str : list
                    ) {
                for (int j = 0; j < str.length(); j++) {
                    if (key.equals(str.charAt(j))) {
                        value++;
                    }
                }
            }
            pair.setValue(value);
        }

        /*for (Map.Entry<Character, Integer> pair : map.entrySet()
             ) {
            Character key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }*/

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.print(alphabet.get(i).toString() + " " + map.get(alphabet.get(i)).toString());
            System.out.print("\n");
        }
    }

}
