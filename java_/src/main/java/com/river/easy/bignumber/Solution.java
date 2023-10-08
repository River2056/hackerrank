package com.river.easy.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigDecimal firstNum = new BigDecimal(a);
            BigDecimal secondNum = new BigDecimal(b);
            System.out.println(firstNum.add(secondNum));
            System.out.println(firstNum.multiply(secondNum));
        }
    }
}
