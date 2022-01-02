package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

public class CardConv {

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while (x != 0);
        return digits;
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int no; //변환할 음이아닌 정수
        int cd; //기수
        int dno; // 변환완료 된 정수의 자릿수
        char[] cno = new char[32];
        int retry; //다시할지 여부

        do{
            do {
                System.out.println("변환할 음이 아닌 정수를 입력해주세요");
                no = stdIn.nextInt();
            } while(no < 0);

            do {
                System.out.println("몇 진수로 변환할지 입력해주세요");
                cd =  stdIn.nextInt();
            }while(cd < 2 || cd >36 );

            dno = cardConv(no, cd, cno);

            System.out.print(cd +"진수로는");
            for(int i = dno - 1; i >= 0; i--)
                System.out.print(cno[i]);
                System.out.println("입니다");

            System.out.print("역방향변환");
            for(int i = 0; i < dno; i++)
                System.out.print(cno[i]);
                System.out.println("입니다");

                System.out.println("한번 더 할까요? (1.예 / 0. 아니오");
            retry = stdIn.nextInt();

        }while(retry == 1);
    }
}
