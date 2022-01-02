package com.aiden.algorithm.Loop.practice;

import java.util.Scanner;

public class SumForPosPractice {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int a;
        int b;
        int result ;

        System.out.println("정수 두개를 입력해주세요");

        while(true) {
            System.out.print("정수 a의 값을 입력해주세요 : ");
            a = stdIn.nextInt();

            System.out.print("정수 b의 값을 입력해주세요 : ");
            b = stdIn.nextInt();

            if(b > a) {
                break;
            }
            System.out.println("b는 a보다 커야합니다");
        }
        System.out.println("b - a 는 : " + (b - a) + "입니다");
        
    }
}


