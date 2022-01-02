package com.aiden.algorithm.Loop.practice;

import java.util.Scanner;

public class SumForPosPractice2 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        //입력할 정수 변수 선언
        int n;
        do{
            System.out.println("양의 정수 n을 읩력해주세요 : ");
            n = stdIn.nextInt();
        }while(n < 0);

        int no = 0;
        while(n > 0) {
                n /= 10;
                no++;
        }
        System.out.println("그 수는 " + no + " 자리 입니다.");


    }
}
