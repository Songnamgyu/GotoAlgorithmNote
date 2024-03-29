package com.aiden.algorithm.Array;

import java.util.Scanner;

public class MaxOfArray {
    //배열 int의 최대값을 구하는 메서드
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max) { max = a[i]; }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다");
        System.out.println("사람의 수 ");
        int num = stdIn.nextInt();
        
        int[] height = new int[num];
        for(int i = 0; i < num; i++) {
            height[i] = stdIn.nextInt();
        }
        System.out.println(" 최대값의 키는 : " + maxOf(height) + "d");
    }
}
