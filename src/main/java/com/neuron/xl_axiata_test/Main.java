package com.neuron.xl_axiata_test;

import com.neuron.xl_axiata_test.nomor_dua.Pyramid;
import com.neuron.xl_axiata_test.nomor_tiga.SumOfArray;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.neuron.xl_axiata_test.nomor_satu.MergeSort.MergeSort;

public class Main
{
    public static void main( String[] args ) {

        // Nomor 1
        nomorSatu();

        // Nomor 2
        nomorDua();

        //nomor 3
        nomorTiga();
    }

    private static void printNumsWithStream(IntStream streamNums) {
        System.out.println(
                streamNums.mapToObj(String::valueOf).collect(Collectors.joining(", "))
        );
    }

    private static void nomorSatu() {
        Random random = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }

        System.out.println("=".repeat(16) + " Unsorted Array " + "=".repeat(15));
        //System.out.println(Arrays.toString(nums));
        printNumsWithStream(Arrays.stream(nums));

        // implementasi algoritma merge sort
        MergeSort(nums);

        System.out.println("\n" + "=".repeat(14) + " 01. Sorted  Array " + "=".repeat(14));
        printNumsWithStream(Arrays.stream(nums));
        //System.out.println(Arrays.toString(nums));
    }

    private static void nomorDua(){
        int height = 5;

        System.out.println();
        System.out.println("=".repeat(12) + " 02. Pyramid Character " + "=".repeat(12));
        Pyramid.GeneratePyramid(height);
    }

    private static void nomorTiga(){
        int[] numsArr = { 10, 10, 10, 10, 10, 10 };

        System.out.println();
        System.out.println("=".repeat(12) + " 03. Sum Of Array " + "=".repeat(12));
        System.out.print("Jumlah: ");
        SumOfArray.FindSumOfArray(numsArr);
    }
}
