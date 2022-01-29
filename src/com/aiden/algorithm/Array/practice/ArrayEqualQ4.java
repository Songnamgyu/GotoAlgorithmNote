package com.aiden.algorithm.Array.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualQ4 {

    static void copy(int[] a , int[] b) {
        a = b;
        for(int i = 0 ; i < b.length; i++) {
            a[i] = b[i];
        }
        System.out.println("a" + Arrays.toString(a));
        System.out.println("b" + Arrays.toString(b));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열 b의 요솟수를 입력하세요");
        int nb = stdIn.nextInt();
        int[] b = new int[nb];
        int[] a = new int[nb];
        for(int i = 0; i < nb; i++) {
            System.out.println("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }
        copy(a , b);
    }
}
