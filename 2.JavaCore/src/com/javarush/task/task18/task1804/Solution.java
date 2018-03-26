package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer k : list
                ) {
            if (map.containsKey(k)) {
                Integer v = map.get(k) + 1;
                map.replace(k, v);
            } else {
                map.put(k, 1);
            }
        }

        Map<Integer, Integer> sortedMap = sortByComparator(map, true);

        Integer min = sortedMap.entrySet().iterator().next().getValue();

        for (Map.Entry<Integer, Integer> pair : sortedMap.entrySet()
                ) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (value == min) {
                System.out.print(key + " ");
            }
        }
    }

    private static Map<Integer, Integer> sortByComparator(Map<Integer, Integer> unsortMap, final boolean order) {

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
