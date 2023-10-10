package com.river.easy.subarray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Solution
 */
public class Solution {
    private static Integer[] count = new Integer[] { 0 };

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int length = Integer.parseInt(sc.nextLine());
            int[] array = new int[length];
            String input = sc.nextLine();
            String[] numberStringArray = input.split(" ");

            for (int i = 0; i < length; i++)
                array[i] = Integer.parseInt(numberStringArray[i]);

            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
            countSub(list, 0, 1, count);
            System.out.println(count[0]);
        }
    }

    private static void countSub(List<Integer> list, Integer left, Integer right, Integer[] count) {
        if (left > list.size() || right > list.size())
            return;

        int i = left, j = right;
        while (i < j) {
            List<Integer> subList = list.subList(i, j);
            int subTotal = subList.stream().reduce(0, Integer::sum);
            if (subTotal < 0)
                count[0]++;
            System.out.printf("subList: %s%n", subList);
            i++;
        }

        countSub(list, left, right + 1, count);
    }
}
