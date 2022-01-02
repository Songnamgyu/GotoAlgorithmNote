package com.aiden.algorithm.Loop;

import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while( i <= n) {
            System.out.println("i 값이 증가하는지 나타내는 출력문 : " + i + " 번째의 값은 " + i + "입니다");
            sum += i;
            i++;

        }
        System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 입니다");
        
    }
}
