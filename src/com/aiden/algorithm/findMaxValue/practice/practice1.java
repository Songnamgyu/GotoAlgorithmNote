package com.aiden.algorithm.findMaxValue.practice;

public class practice1 {
    public static void main(String[] args) {

        System.out.println("max4 메서드의 최대값은 : " + max4(1, 10, 20, 111));
        System.out.println("min3 메서드의 최소값은 : " + min3(7, 20, 11));
        System.out.println("min4 매서드의 최소값은 : " + min4(9, 11, 2, 999));
    }

    // 1. 최대값을 구하는 메서드
    static int max4(int a, int b , int c, int d) {

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max ;
    }

    // 2. 최소값을 구하는 메서드
    static int min3(int a, int b, int c) {
        // 기본 설정으로 최소값을 a라고 설정해줍니다.
        int min = a;
        // 만약 min > b 라면 최소값은 b
        if(min > b) min = b;

        // 만약 min > c 라면 최소값은 c
        if(min > c) min = c;

        return min;
    }

    //3. 네 값의 최소값을 구하는 메서드
    static int min4( int a, int b , int c, int d) {
        // 기본설정으로 최소값을 a라고 설정해준다.
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;

        return min;
    }
}
