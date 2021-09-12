package com.aiden.algorithm.findMaxValue;

import java.util.Scanner;

public class findMaxNum {
    // 3개의 정숫값을 입력하고 최대값을 구합니다.

    public static void main(String[] args) {
        // 1. a, b, c 에 숫자를 입력하여 그 중에 최대값을 구하는 로직을 생성합니다.
        // 2. 입력을 해야하므로 Scanner를 활용합니다.
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최대 값을 구합니다. ");
        System.out.println("첫번째 정수 a 값을 입력해주세요!");
        int a  = stdIn.nextInt();
        System.out.println("두번째 정수 b 값을 입력해주세요!");
        int b = stdIn.nextInt();
        System.out.println("세번째 정수 c 값을 입력해주세요!");
        int c = stdIn.nextInt();

        // max값을 임의로 하나 설정해둔다.
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("a , b, ,c 중 최대 값은 : " + max + "입니다.");

    }

}
