package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 500);
        map.put("Герцев", 400);
        map.put("Клят", 1000);
        map.put("Блинов", 1500);
        map.put("Жилин", 300);
        map.put("Рамзин", 150);
        map.put("Федорин", 700);
        map.put("Бешенцев", 800);
        map.put("Нетребин", 450);
        map.put("Юдин", 700);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> map1 = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : map1.entrySet()
             ) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value < 500) {
                map.remove(key, value);
            }
        }
    }

    public static void main(String[] args) {
        HashMap mapp = createMap();
        removeItemFromMap(mapp);

    }
}