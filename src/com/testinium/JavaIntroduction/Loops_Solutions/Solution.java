package com.testinium.JavaIntroduction.Loops_Solutions;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for(int i = 1; i <= 10; i++){
            int sonuc = N*i;
            System.out.println(N+" x "+i+" = "+sonuc );
        }


    }
}
