package com.aiden.algorithm.Array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualsQ5 {
    static void rcopy(int [] a , int[] b) {
        for(int i = 0; i < b.length; i++) {
            a[i] = b[(b.length - i -1)];
        }
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("b의 배열 크기를 정해주세요");
        int c = stdIn.nextInt();
        int[] b = new int[c];
        int[] a = new int[c];

        for(int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"] : ");
            b[i] = stdIn.nextInt();
        }

        rcopy(a,b);
    }
}
