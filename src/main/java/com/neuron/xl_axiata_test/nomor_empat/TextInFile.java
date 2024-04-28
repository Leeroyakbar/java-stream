package com.neuron.xl_axiata_test.nomor_empat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextInFile {
    public static void findTextInFile(String fileName, String searchFor) {
        createFile(fileName);

        readFile(fileName, searchFor);


    }

    public static void readFile(String filename, String searchFor) {
        File exampleFile = new File(filename);
        Boolean isFound = false;
        int lineNumber = 0;
        try {
            FileReader fr = new FileReader(exampleFile);
            Scanner scanner = new Scanner(fr);
            while(scanner.hasNextLine()){
                lineNumber++;
                if(scanner.nextLine().contains(searchFor)){
                    System.out.println("String " + searchFor + " ditemukan pada baris " + lineNumber);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("String " + searchFor + " tidak ditemukan");
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getStackTrace());
        }
    }

    public static void createFile(String filename) {
        try {
            File myTextFile = new File(filename);
            if (!myTextFile.exists()) {
                myTextFile.createNewFile();
                System.out.println("File Created " + myTextFile.getName());
                System.out.println("Absolute path " + myTextFile.getAbsolutePath());
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e){
            System.out.println("Error ");
            e.getStackTrace();
        }
    }
}
