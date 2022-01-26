package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

public class ReverseArray0 {

    static void swap(int[] a, int adx1, int adx2){
        int t = a[adx1]; a[adx1] = a[adx2]; a[adx2] = t;
    }

    static void reverse(int[] a) {
        //요소 역순정렬 설정
        for(int i = 0; i < a.length / 2; i++) {
            swap(a,i,a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요소수를 정하세요");
        int num  = stdIn.nextInt(); // 배열의 길이 정하기
        int[] x = new int[num]; // 배열 선언

        for(int i = 0; i < num; i++) {
            //for문을 돌리면서 배열의 요소 값 입력해주기
            System.out.println("x : " + "x[" + i + "]" );
            x[i] = stdIn.nextInt();
        }

        reverse(x); //  배열 a의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다");
        for(int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : " + x[i] );
        }
    }
}
