package com.hometasks.lesson11;

import java.util.*;

public class Lesson11 {
    public static void main(String[] args) {
        Map<Integer,String> someMap = new HashMap<>();
        someMap.put(100, "value100");
        someMap.put(5, "value5");
        someMap.put(30, "value30");
        someMap.put(123, "value100");

        methodForMapPrinting(someMap);
    }

    private static void methodForMapPrinting(Map<Integer,String> map) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        for (Map.Entry<Integer, String> l : treeMap.entrySet()) {
            System.out.println(l.getKey() + "=" + l.getValue());
        }
    }
}
