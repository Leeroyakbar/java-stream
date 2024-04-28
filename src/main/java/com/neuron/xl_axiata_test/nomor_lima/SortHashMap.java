package com.neuron.xl_axiata_test.nomor_lima;

import java.util.*;
import java.util.stream.Stream;

public class SortHashMap {

    public static void SortHashMap(Map<String, Integer> hashMap){
        System.out.println("Sebelum pengurutan: " + hashMap);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Menampilkan HashMap setelah pengurutan
        System.out.println("Setelah pengurutan: " + sortedMap);

    }
}
