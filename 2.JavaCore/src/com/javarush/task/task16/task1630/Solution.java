package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String filename;
        String content = "";

        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }

        @Override
        public String getFileContent() {

            return content;
        }

        @Override
        public void run() {
            try {
                BufferedReader filereader = new BufferedReader(new FileReader(filename));
                while (filereader.ready()) {
                    content = content + " " + filereader.readLine();
                }
                filereader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
