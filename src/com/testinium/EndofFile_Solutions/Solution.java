package com.testinium.EndofFile_Solutions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; scan.hasNext(); i++) { //hasNext() --> checks if the Scanner has another token in its input
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
