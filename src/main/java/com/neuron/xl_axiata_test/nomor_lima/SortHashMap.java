package com.neuron.xl_axiata_test.nomor_lima;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMap {

    public static void SortHashMap(Map<String, Integer> hashMap){
        System.out.println("Sebelum pengurutan: " + hashMap);

        Map<String, Integer> sortedMap = hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (preValue, postValue) -> preValue,
                    LinkedHashMap::new
                ));

        // Menampilkan HashMap setelah pengurutan
        System.out.println("Setelah pengurutan: " + sortedMap);

    }
}
