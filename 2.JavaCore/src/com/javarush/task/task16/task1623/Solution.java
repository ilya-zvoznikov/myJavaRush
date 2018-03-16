package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    /*static {
        countCreatedThreads = 0;
    }*/

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++Solution.countCreatedThreads));
            start();
        }

        @Override
        public void run() {
            if (Solution.countCreatedThreads < Solution.count) {
                GenerateThread thread = new GenerateThread();
                System.out.println(thread);
            }
        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
