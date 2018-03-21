package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Иванов", "Игорь");
        map.put("Герцев", "Олег");
        map.put("Рамзин", "Евгений");
        map.put("Жилин", "Михаил");
        map.put("Юдин", "Андрей");
        map.put("Клят", "Геннадий");
        map.put("Бешенцев", "Андрей");
        map.put("Блинов", "Иван");
        map.put("Устинов", "Павел");
        map.put("Федорин", "Игорь");
        return map;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int n = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()
             ) {
            String value = pair.getValue();
            if (value.equals(name)) n++;
        }
        return n;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int n = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()
                ) {
            String value = pair.getKey();
            if (value.equals(lastName)) n++;
        }
        return n;

    }

    public static void main(String[] args) {

    }
}
