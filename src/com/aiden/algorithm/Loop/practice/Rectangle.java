package com.aiden.algorithm.Loop.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("사각형를 출력합니다");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("단수 : ");
        int n = stdIn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++)
                System.out.print("*");
                System.out.println();
        }
    }
}
