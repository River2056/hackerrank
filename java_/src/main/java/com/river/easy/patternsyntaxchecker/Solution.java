package com.river.easy.patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int times = Integer.parseInt(sc.nextLine());

            while (times-- > 0) {
                String pattern = sc.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (Exception e) {
                    System.out.println("Invalid");
                }
            }
        }
    }

}
