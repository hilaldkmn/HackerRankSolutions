package com.testinium.JavaStrings.StringIntroduction_Solutions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int aLength = A.length();
        int bLength = B.length();
        System.out.println(aLength + bLength);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No"); // comparison of strings
        String UpperA = (A.substring(0, 1).toUpperCase() + A.substring(1));
        String UpperB = (B.substring(0, 1).toUpperCase() + B.substring(1));
        System.out.println(UpperA + " " + UpperB);
    }
}
