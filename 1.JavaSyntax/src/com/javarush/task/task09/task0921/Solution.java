package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                String a = reader.readLine();
                if (a.equals("")) break;
                Integer b = Integer.parseInt(a);
                list.add(b);
            }

        }
        catch (NumberFormatException e) {
            for (Integer s : list
                 ) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            for (Integer s : list
                    ) {
                System.out.println(s);
            }
        }
    }
}
