package com.aiden.algorithm.JudgeSign;

import java.util.Scanner;

public class JudgeSignPractice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = stdIn.nextInt();

        if(n > 0) {
            System.out.println("입력한 수는 양수 입니다.");
        }else if(n < 0) {
            System.out.println("입력한 수는 음수 입니다.");
        }else {
            System.out.println("입력한 수는 0 입니다.");
        }
    }
}
