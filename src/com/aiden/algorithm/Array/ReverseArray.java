package com.aiden.algorithm.Array;

import java.util.Scanner;

public class ReverseArray {

    //배열요소의 값을 읽어 들여 역순으로 정렬합니다.

    static void swap(int[] a , int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {

        // 요소 개수가 n인 배열 요소를 역순으로 정렬하는 알고리즘 : for(i = 0; i < n/2; i++)
        for(int i = 0; i < a.length/2; i++) {
         swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 수(n) : " );
        int n = stdIn.nextInt(); // 요소의 수

        int[] x = new int[n]; //요솟수가 n인 배열

        for(int i = 0 ; i < n; i++){
            System.out.print("x["+i+"] :");
            x[i] = stdIn.nextInt();
        }
        reverse(x); // 배열 a의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬햇습니다.");
        for(int i = 0; i < n; i++){
            System.out.println("x["+i+"]: " + x[i] );
        }
    }
}
