package com.aiden.algorithm.Loop.practice;

import java.util.Scanner;

public class GausPractice {

    public static void main(String[] args) {
        // 가우스의 덧셈 : 1부터 10까지의 합 = ( 1 + 10 ) * 5 와 같은 방식
        Gaus(1, 20);

        System.out.println("예제 답안지는 이렇게~");
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값：");
        int n = stdIn.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }

    static double Gaus(double a, double b) {

        double gaus = (a + b ) * (Math.floor((double) b / 2));
        System.out.println("gaus : " + (int)gaus);

        return gaus;


    }

}
