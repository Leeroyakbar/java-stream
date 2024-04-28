package com.neuron.xl_axiata_test.nomor_tiga;

import java.util.Arrays;

public class SumOfArray {
    public static void FindSumOfArray(int[] arr) {
        int sum = Arrays.stream(arr).sum();

        System.out.println(sum);
    }
}
