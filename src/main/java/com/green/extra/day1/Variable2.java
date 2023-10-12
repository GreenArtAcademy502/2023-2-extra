package com.green.extra.day1;

public class Variable2 {
    public static void main(String[] args) {
        int x = 10, y = 50;
        int tmp = x;
        x = y;
        y = tmp;
        System.out.printf("x: %d, y: %d\n", x, y);
    }
}
