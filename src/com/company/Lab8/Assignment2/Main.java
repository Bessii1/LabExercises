package com.company.Lab8.Assignment2;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File file = new File("BinaryFiles");
        int array[] = {2,3,4,5,6,7,78,12,343,6454,32};
        try {
            writeArray(file, array);
            readArray(file,array);
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

    }
    public static void writeArray(File file, int array[]) throws IOException {
        FileOutputStream fileOutputStream =new FileOutputStream(file);
        for (int i = 0; i < array.length; i++) {
            fileOutputStream.write(array[i]);
        }
        fileOutputStream.close();
    }
    public static void readArray(File file, int array[]) throws IOException {
        FileInputStream fileInputStream =new FileInputStream(file);

        int value;
        while ((value = fileInputStream.read()) != -1) {
            int i = 0;
            array[i]=value;
            System.out.print(value + " ");
            i++;
        }

        fileInputStream.close();
    }
}
