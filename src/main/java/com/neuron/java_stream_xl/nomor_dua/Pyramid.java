package com.neuron.java_stream_xl.nomor_dua;

import java.util.stream.IntStream;

public class Pyramid {
    private int height;

    public Pyramid(int height) {
        this.height = height;
    }

    public void GeneratePyramid() {
        IntStream.range(1, height + 1)
                .forEach( i -> {
                    int numChars = 2 * i - 1;
                    int numSpace = height - i;

                    System.out.print(" ".repeat(numSpace));

                    System.out.print("*".repeat(numChars));

                    System.out.println();
                });
    }
}
