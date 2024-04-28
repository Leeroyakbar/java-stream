package com.neuron.xl_axiata_test.nomor_satu;

public class MergeSort {

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
