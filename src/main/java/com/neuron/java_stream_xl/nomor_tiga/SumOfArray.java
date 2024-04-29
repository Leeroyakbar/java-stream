package com.neuron.java_stream_xl.nomor_tiga;

import java.util.Arrays;

public class SumOfArray {
    private final int[] arr;

    public SumOfArray(int[] arr) {
        this.arr = arr;
    }

    public void findSumOfArray() {
        int sum = Arrays.stream(this.arr).sum();
        int reduce = Arrays.stream(this.arr).reduce(0, (left, right) -> left + right);
        System.out.println(reduce);
    }
}
