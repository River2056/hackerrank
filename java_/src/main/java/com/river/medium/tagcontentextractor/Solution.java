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
            extract(line);

            testCases--;
        }
    }

    private static List<String> extract(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder tokenBuilder = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        Map<Character, List<Integer>> map = new HashMap<>();
        int i = 0;
        while (i < line.length()) {
            if (line.charAt(i) == '<') {
                tokenBuilder.append(line.charAt(i));
                int j = i;
                while (line.charAt(j) != '>' && j < line.length()) {
                    tokenBuilder.append(line.charAt(j));
                    j++;
                }
                tokenBuilder.append(line.charAt(j));
                stack.add(tokenBuilder.toString());
                i = j;
            }
            sb.append(line.charAt(i));
            i++;
            /* if (line.charAt(i) == '>')
                addToMap('>', i, map); */
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
