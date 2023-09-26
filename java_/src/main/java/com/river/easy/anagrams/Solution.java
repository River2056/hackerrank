package com.river.easy.anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static String isAnagram(String a, String b) {
        if (a.length() != b.length())
            return "Not Anagrams";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (!map.containsKey(a.charAt(i)))
                map.put(a.charAt(i), 1);
            else
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }

        boolean notAnagram = map.entrySet().stream().map(Map.Entry::getValue).anyMatch(value -> value > 0);
        return notAnagram ? "Not Anagrams" : "Anagrams";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(isAnagram(a.toLowerCase(), b.toLowerCase()));
    }
    
}
