package com.neuron.xl_axiata_test.nomor_empat;

import java.io.*;
import java.nio.BufferOverflowException;
import java.util.AbstractMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TextInFile {
    private String fileName;
    private String pathFile;

    public TextInFile(String fileName, String pathFile) {
        this.fileName = fileName;
        this.pathFile = pathFile;
    }

    private void createFile(String filename) {
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

    private void readFile(String filename, String searchFor) {
        File exampleFile = new File(filename);
        boolean isFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(exampleFile))) {
            isFound = IntStream.range(0, Integer.MAX_VALUE)
                    .mapToObj( lineNumber -> {
                        try {
                            String line = reader.readLine();
                            if ( line == null ){
                                return null;
                            }
                            return new AbstractMap.SimpleEntry<>(lineNumber + 1, line);
                        }catch (IOException e){
                            return null;
                        }
                    })
                    .takeWhile(dataEntry -> dataEntry != null )
                    .anyMatch( dataEntry -> {
                        if (dataEntry.getValue().contains(searchFor)){
                            System.out.println("String " + searchFor + " ditemukan di pada baris " + dataEntry.getKey());
                            return true;
                        }

                        return  false;
                    } );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(!isFound){
            System.out.println("String " + searchFor + " tidak ditemukan !");
        }
    }

    public void findTextInFile(String searchFor) {
        createFile(this.fileName);
        readFile(this.fileName, searchFor);
    }

}
