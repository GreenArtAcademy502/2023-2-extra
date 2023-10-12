package com.green.extra.day1;

public class Casting {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        // n1 / n2 >>> 3.333

        long l1 = 10000L;
        float f2 = l1;

        float f = (float)n1 / n2;
        System.out.printf("%.3f\n", f);
    }
}
