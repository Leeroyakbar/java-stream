package com.neuron.xl_axiata_test.nomor_dua;

import java.util.stream.IntStream;

public class Pyramid {
    public static void GeneratePyramid(int height) {
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
