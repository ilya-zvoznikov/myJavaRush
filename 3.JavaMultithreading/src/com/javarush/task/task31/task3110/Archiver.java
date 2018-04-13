package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //zip name
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(bufferedReader.readLine()));
        //source name
        zipFileManager.createZip(Paths.get(bufferedReader.readLine()));
        bufferedReader.close();
    }
}
