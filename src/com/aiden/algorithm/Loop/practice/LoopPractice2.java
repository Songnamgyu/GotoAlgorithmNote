package com.aiden.algorithm.Loop.practice;

import java.util.Scanner;

public class LoopPractice2 {

    public static void main(String[] args) {
        sumof(5, 3);
        sumof(5,3);

        Scanner stdIn = new Scanner(System.in);

        System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumofAnswer(a, b) + "입니다.");
    }

    static int sumof(int a, int b) {
        int sum = 0;
        int c = 0;
        if( a > b) {
            for(c = b; b <= a; b++) {
                sum += b;
                System.out.println("sum : " + sum);
            }
            System.out.println("두 정수 사이의 합은 : " + sum + "입니다");
        }else if ( a < b ) {
            for(c = a; a <= b; a++) {
                sum += a;
                System.out.println("두 정수 사이의 합은 : " + sum + "입니다");
            }
        }
        return sum;
    }

    static int sumofAnswer(int a, int b) {
        int min; // a, b의 작은 쪽의 값
        int max; // a, b의 큰 쪽의 값

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0; // 합
        for (int i = min; i <= max; i++)
            sum += i;
        return (sum);
    }
}
