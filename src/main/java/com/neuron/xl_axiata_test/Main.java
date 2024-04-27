package com.neuron.xl_axiata_test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    public static void main( String[] args ) {
        Random random = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }

        System.out.println("=".repeat(16) + " Unsorted Array " + "=".repeat(15));
//        System.out.println(Arrays.toString(nums));
        printNumsWithStream(Arrays.stream(nums));

        // implementasi algoritma merge sort
        MergeSort(nums);

        System.out.println("\n" + "=".repeat(16) + " Sorted  Array " + "=".repeat(16));
        printNumsWithStream(Arrays.stream(nums));
//        System.out.println(Arrays.toString(nums));
    }

    private static void printNumsWithStream(IntStream streamNums) {
        System.out.println(
                streamNums.mapToObj(String::valueOf).collect(Collectors.joining(", "))
        );
    }


    public static void MergeSort(int[] nums){
        int numsLength = nums.length;
        if(numsLength < 2){
            return;
        }

        int middleIndex = numsLength / 2;
        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[numsLength - middleIndex];

        for (int i = 0; i < middleIndex ; i++) {
            leftSide[i] = nums[i];
        }

        for (int i = middleIndex; i < numsLength; i++) {
            rightSide[i - middleIndex] = nums[i];
        }

        MergeSort(leftSide);
        MergeSort(rightSide);

        //merge
        merge(nums, leftSide, rightSide);
    }

    public static void merge(int[] nums, int[] leftSide, int[] rightSide){
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftSide[i] <= rightSide[j]){
                nums[k] = leftSide[i];
                i++;
            }else {
                nums[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            nums[k] = leftSide[i];
            i++;
            k++;
        }
        while(j < rightSize){
            nums[k] = rightSide[j];
            j++;
            k++;
        }
    }

}
