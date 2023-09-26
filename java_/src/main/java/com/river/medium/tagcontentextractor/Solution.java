package com.river.medium.tagcontentextractor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            // Write your code here

            testCases--;
        }
    }

    private static List<String> extract(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '<')
                addToMap('<', i, map);
            if (line.charAt(i) == '>')
                addToMap('>', i, map);
        }

        return null;
    }

    private static void addToMap(Character key, Integer index, Map<Character, List<Integer>> map) {
        List<Integer> indexes;
        if (map.containsKey(key))
            indexes = map.get(key);
        else
            indexes = new ArrayList<>();

        indexes.add(index);
        map.put(key, indexes);
    }
}
