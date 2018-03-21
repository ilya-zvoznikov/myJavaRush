package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int s = 0;
        if ((a == b) && (b == c) && (a == c))
            s = a;
        else {
            if (a == b)
                s = a;
            else {
                if (b == c)
                    s = b;
                else {
                    if (a == c)
                        s = a;
                    else {
                        if (((a < b) && (a > c)) || ((a > b) && (a < c)))
                            s = a;
                        else {
                            if (((b < c) && (b > a)) || ((b > c) && (b < a)))
                                s = b;
                            else {
                                if (((c < a) && (c > b)) || ((c > a) && (c < b)))
                                    s = c;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(s);
    }
}
