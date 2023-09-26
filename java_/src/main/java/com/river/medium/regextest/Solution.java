package com.river.medium.regextest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ipStr = sc.next();
            Pattern pattern = Pattern.compile("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");
            Matcher matcher = pattern.matcher(ipStr);
            if (matcher.matches()) {
                String[] ipOctets = matcher.group().split("\\.");
                boolean isIp = true;
                for (String octets : ipOctets) {
                    try {
                        int octetNum = Integer.parseInt(octets);
                        if (octetNum < 0 || octetNum > 255) {
                            isIp = false;
                            break;
                        }
                    } catch (Exception e) {
                        isIp = false;
                    }
                }
                System.out.println(isIp);
            } else {
                System.out.println(false);
            }
        }
        sc.close();
    } 
}
