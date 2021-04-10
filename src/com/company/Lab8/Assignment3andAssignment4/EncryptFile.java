package com.company.Lab8.Assignment3andAssignment4;

import java.io.*;
import java.util.Scanner;

public class EncryptFile {
    public static void main(String[] args) throws IOException {
        decryptFile();
    }
    public static void encryptFile() throws IOException {
        Scanner sc =new Scanner(new File("src/com/company/Lab8/Assignment3andAssignment4/NormalFile"));
        String dataAfter = "";
        while(sc.hasNext()){
            String data = sc.next();
            for (int i = 0; i < data.length(); i++) {
                dataAfter += (char)((int)(data.charAt(i)) + 10)+"";
            }
            dataAfter += " ";
        }
        FileWriter writeFile = new FileWriter(new File("src/com/company/Lab8/Assignment3andAssignment4/EncryptedFile"));
        writeFile.write(dataAfter.trim());
        writeFile.close();
        sc.close();
    }
    public static void decryptFile() throws IOException{
        Scanner sc =new Scanner(new File("src/com/company/Lab8/Assignment3andAssignment4/EncryptedFile"));
        String dataAfter = "";
        while(sc.hasNext()){
            String data = sc.next();
            for (int i = 0; i < data.length(); i++) {
                dataAfter += (char)((int)(data.charAt(i)) - 10)+"";
            }
            dataAfter += " ";
        }
        FileWriter writeFile = new FileWriter(new File("src/com/company/Lab8/Assignment3andAssignment4/DecryptedFile"));
        writeFile.write(dataAfter.trim());
        writeFile.close();
        sc.close();
    }
}
