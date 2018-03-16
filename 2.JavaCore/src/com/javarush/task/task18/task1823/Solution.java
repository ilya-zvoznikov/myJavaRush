package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
        System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private FileInputStream fileInputStream;

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.fileName = fileName;
            this.fileInputStream = new FileInputStream(this.fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            HashMap<Integer, Integer> map = new HashMap<>();
            try {
                while (this.fileInputStream.available() > 0) {
                    int b = this.fileInputStream.read();
                    if (!map.containsKey(b)) {
                        map.put(b, 1);
                    } else {
                        Integer d = map.get(b);
                        map.put(b, ++d);
                    }
                }
                this.fileInputStream.close();
            } catch (IOException e) {
            }
            int max = 0;
            int maxByte = 0;
            for (Map.Entry<Integer, Integer> pair : map.entrySet()
                    ) {
                if (pair.getValue() > max) {
                    max = pair.getValue();
                    maxByte = pair.getKey();
                }
            }
            resultMap.put(this.fileName, maxByte);
        }

    }
}
