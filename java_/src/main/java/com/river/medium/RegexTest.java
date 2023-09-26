package com.river.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegexTest
 */
public class RegexTest {

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
