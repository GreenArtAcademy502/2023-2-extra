package com.green.extra.day1;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("x / y = %d, 나머지값: %d\n", x / y, x % y);

        int val = (int)(Math.random() * 10) + 1; //1~10 랜덤값 나오게
        System.out.printf("val: %d > %s수입니다.\n"
                , val, val % 2 == 0 ? "짝":"홀");

        //val: 2 > 짝수입니다.
        //val: 3 > 홀수입니다.
    }
}
