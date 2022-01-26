package com.aiden.algorithm.Array.practice;
/*
* 클래스 설명 : 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요
* 날짜 : 2022.01.26
* */
public class ReverseArrayQ3 {

    static int sumOf(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++ ) {
            sum += a[i];
        }
        System.out.println("배열모든요소의 총합  : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        //배열 선언
        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
        sumOf(num);
    }

}
