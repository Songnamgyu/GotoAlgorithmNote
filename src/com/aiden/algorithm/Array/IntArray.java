package com.aiden.algorithm.Array;

// 기본 배열 선언과 배열을 출력해보기
public class IntArray {
    public static void main(String[] args) {
        // 배열 기본
        // 1. 배열을 선언해준다
        int[] a = new int[5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        //2. for문을 이용해 각 배열의 요소들을 출력한다
        for(int i = 0; i < a.length; i++) {
            System.out.println("a의 모든 배열요소는 a["+i+"] : " + a[i]);
        }
    }

}
