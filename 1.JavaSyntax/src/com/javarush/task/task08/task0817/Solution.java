package com.javarush.task.task08.task0817;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Игорь");
        map.put("Герцев", "Олег");
        map.put("Блинов", "Иван");
        map.put("Попов", "Дмитрий");
        map.put("Рамзин", "Евгений");
        map.put("Бешенцев", "Андрей");
        map.put("Юдин", "Андрей");
        map.put("Клят", "Геннадий");
        map.put("Нетребин", "Роман");
        map.put("Устинов", "Павел");
        return map;


    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        HashMap<String, String> copy1 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()
             ) {
            String key = pair.getKey();
            String value = pair.getValue();
            copy1.remove(key, value);
            for (Map.Entry<String, String> p : copy1.entrySet()
                 ) {
                //String k = p.getKey();
                String v = p.getValue();
                if (v.equals(value)) {
                    removeItemFromMapByValue(map, value);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
