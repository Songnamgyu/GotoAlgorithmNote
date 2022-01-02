package com.aiden.algorithm.Loop.practice;

import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1 부터 n 까지의 합을 구합니다");
        System.out.println("n 의 값을 입력해주세요");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        for(i = 1; i <= n; i++) {
            sum += i;
            if( i == n) {
                System.out.print(i);
            }else {
                System.out.print(i + "+");
            }
        }
        System.out.println(" = " + sum);

    }
}
