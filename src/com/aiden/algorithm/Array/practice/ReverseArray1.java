package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

//ReverseArray2 클래스를 토대지만 배열요소를 직접입력받아 역순정렬하는 프로그램
public class ReverseArray1 {
    
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    static void reverse(int[] a) {
        for(int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열의 요소 갯수를 입력해주세요");
        int n = stdIn.nextInt(); //배열의 요소갯수
        
        int[] a = new int[n];

        System.out.println("요소의 갯수에 맞게 각 인덱스의 값을 입력해주세요");
        for(int i = 0; i < n; i++) {
            System.out.print("a["+i+"]:");
            a[i] = stdIn.nextInt();
            System.out.println("입력완료");
        }
        
        reverse(a);
        for(int i =0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("역순정렬을 마칩니다");
    }
    
}
