package com.testinium.JavaIntroduction.StdinandStdout_Solutions;

import java.util.Scanner;

public class Solition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); //this is to clear the keyboard buffer
        String s = scan.nextLine();



        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
