package com.river.easy.stringtokens;

import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void stringTokens(String s) {
        String[] arr = new String[0];
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            arr = s.split("[ !,?._'@]+");
            System.out.println(arr.length);
        }
        if (arr.length > 0)
            for (String s1 : arr)
                System.out.println(s1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        stringTokens(s);
    }

}
