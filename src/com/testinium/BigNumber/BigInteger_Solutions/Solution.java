package com.testinium.BigNumber.BigInteger_Solutions;

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.add(b) + "\n" + a.multiply(b));
    }
}
