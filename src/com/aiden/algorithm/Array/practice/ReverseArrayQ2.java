package com.aiden.algorithm.Array.practice;

import java.util.Arrays;

public class ReverseArrayQ2 {
    //배열요소를 a[adx1]과 a[adx2]바꿈
    static void swap(int[]a , int adx1, int adx2) {
        int t = a[adx1]; a[adx1] = a[adx2]; a[adx2] = t;
    }
    //배열의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for(int i = 0 ; i < a.length; i++) {
            if(i<3) {
                System.out.println(Arrays.toString(a));
                swap(a,i,a.length-i-1);
                System.out.println("a[" + i + "]과(와) a[" + (a.length - i-1) + "]를 교환합니다.");
            }
            else if(i>=3) {
                continue;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {
        //배열 선언
        int[] num = {5, 10, 73, 2, -5 ,-42};
        System.out.println(Arrays.toString(num));
        System.out.println("=================입구==================");
        reverse(num);
        System.out.println("=================출구==================");
        System.out.println(Arrays.toString(num));

    }



}
