package com.river.medium.tagcontentextractor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private static void extract(String line) {
        Pattern p = Pattern.compile("<([^<>]+)>([^<>]+)<\\/(\\1)>");
        Matcher m = p.matcher(line);
        boolean isExists = false;
        while (m.find()) {
            String s = m.group(2);
            if (!s.isEmpty()) {
                System.out.println(m.group(2));
                isExists = true;
            }
        }
        if (!isExists)
            System.out.println("None");
    }
}
