package com.aiden.algorithm.Loop.practice;

public class Triangle {

    public static void main(String[] args) {
    npira(11);
    }
    static void triangle(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    static void triangleLU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i-1; j++)
                System.out.print(" ");
            for(int j = 1; j <= n - i + 1; j++)
                System.out.print("*");
            System.out.println();
        }

    }
    static void triangleRB(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();

        }
    }

    static void spira(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print("*");
            for(int j =1 ; j <= n - i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
    static void npira(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print(i % 10);
//            for(int j = 1; j <= n - i; j++)
//                System.out.print(" ");
            System.out.println();
        }
    }
}
