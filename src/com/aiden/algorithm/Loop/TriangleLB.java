package com.aiden.algorithm.Loop;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner stuId = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 이등변 삼각형을 출력합니다");

        do {
            System.out.println("몇단 삼각형 입니까 ?");
            n = stuId.nextInt();
        }while(n <= 0);
          for(int i = 1; i <= n; i++){
              for(int j = 1; j <= i; j++)
              System.out.print("*");
              System.out.println();
          }

    }
}
