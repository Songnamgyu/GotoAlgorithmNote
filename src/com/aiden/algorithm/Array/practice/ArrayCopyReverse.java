package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

// 배열 b의 모든요소를 배열 a에 역순으로 복사하는 메서드
public class ArrayCopyReverse {

    static void rcopy(int[] a, int[] b){
        int t ;
        int num = a.length <= b.length ? a.length : b.length;
        for(int i = 0; i < num; i++) {
            a[i] = b[(b.length - i -1)];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟수를 입력해주세요");
        int na = stdIn.nextInt();
        int[] a = new int[na];
        for(int i = 0; i < na; i++) {
            System.out.print("a["+i+"]: ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("요솟수를 입력해주세요 : ");
        int nb = stdIn.nextInt();
        int[] b = new int[nb];
        for(int i = 0; i < nb; i++) {
            System.out.print("b["+i+"] : ");
            b[i] = stdIn.nextInt();
        }
        rcopy(a, b);
        System.out.println("a의 배열이 b의배열을 역순으로 복사했는지 확인");
        for(int i = 0 ; i < na; i++) {
            System.out.print(a[i] + ",");
        }
    }

}
