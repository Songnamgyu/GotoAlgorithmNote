package com.aiden.algorithm.Array;

/*
*  book :  Do it 자료구조와 함께 배우는 알고리즘 입문(JAVA)
*  des :  배열의 모든 요소의 합을 구하여 출력함(for문) p87
*  author : Aiden
* */
public class ArraySumForIn {

    public static void main(String[] args) {
        double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 }; //배열 선언

        for(int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] : " + a[i]);
        double sum = 0; //합계

        for(double i : a)
            sum += i;
        System.out.println("모든 요소의 합은 :  " + sum + "입니다");
    }
}
