package com.neuron.xl_axiata_test;

import com.neuron.xl_axiata_test.nomor_dua.Pyramid;
import com.neuron.xl_axiata_test.nomor_empat.TextInFile;
import com.neuron.xl_axiata_test.nomor_lima.SortHashMap;
import com.neuron.xl_axiata_test.nomor_satu.MergeSort;
import com.neuron.xl_axiata_test.nomor_tiga.SumOfArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main
{
    public static void main( String[] args ) {

        // Nomor 1
        nomorSatu();

        // Nomor 2
        nomorDua();

        // Nomor 3
        nomorTiga();

        // Nomor 4
        nomorEmpat();

        // Nomor 5
        nomorLima();

    }

    private static void printNumsWithStream(IntStream streamNums) {
        System.out.println(
                streamNums.mapToObj(String::valueOf).collect(Collectors.joining(", "))
        );
    }

    private static void nomorSatu() {
        Random random = new Random();
        int[] nums = new int[10];
        MergeSort mergeSort = new MergeSort();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }

        System.out.println("=".repeat(16) + " Unsorted Array " + "=".repeat(15));
        //System.out.println(Arrays.toString(nums));
        printNumsWithStream(Arrays.stream(nums));

        // implementasi algoritma merge sort
        mergeSort.getMergeSort(nums);

        System.out.println("\n" + "=".repeat(14) + " 01. Sorted  Array " + "=".repeat(14));
        printNumsWithStream(Arrays.stream(nums));
        //System.out.println(Arrays.toString(nums));
    }

    private static void nomorDua(){
        Pyramid pyramid = new Pyramid(5);

        System.out.println();
        System.out.println("=".repeat(12) + " 02. Pyramid Character " + "=".repeat(12));
        pyramid.GeneratePyramid();
    }

    private static void nomorTiga() {
        int[] numsArr = { 10, 10, 10, 10, 10, 10 };
        SumOfArray sumOfArray = new SumOfArray(numsArr);

        System.out.println();
        System.out.println("=".repeat(12) + " 03. Sum Of Array " + "=".repeat(12));
        System.out.print("Jumlah: ");
        sumOfArray.findSumOfArray();
    }

    private static void nomorEmpat() {
        TextInFile textInFile = new TextInFile("example.txt", "./");
        String searchFor = "asdfasdf";

        System.out.println();
        System.out.println("=".repeat(12) + " 04. Find String in File " + "=".repeat(12));
        textInFile.findTextInFile(searchFor);
    }

    private static void nomorLima() {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Lee", 23);
        hashMap.put("Roy", 22);
        hashMap.put("Akbar", 25);
        SortHashMap sortHashMap = new SortHashMap(hashMap);

        System.out.println();
        System.out.println("=".repeat(12) + " 05. Sort Hash Map" + "=".repeat(12));
        sortHashMap.getSortHashMap();
    }
}
