package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

public class ArraySum {

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum : " + sum);
        return sum;
    }


    public static void main(String[] args) {
//        int[] a = {11, 22, 33, 44, 55};
//
//        sumOf(a);

        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소의 갯수를 입력해주세요 :");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        System.out.println("각 인덱스의 값을 입력해주세요");
        for(int i = 0; i < n; i++) {
            a[i] = stdIn.nextInt();
            System.out.print("a["+i+"] : ");
            System.out.print(a[i]);
            System.out.println();

        }

        sumOf(a);

    }
}