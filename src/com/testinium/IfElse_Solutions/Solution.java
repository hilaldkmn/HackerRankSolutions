package com.testinium.IfElse_Solutions;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); //thanks HackerRank

        if (N % 2 == 0) {
            if ((N >= 2 && N <= 5) || N > 20) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
