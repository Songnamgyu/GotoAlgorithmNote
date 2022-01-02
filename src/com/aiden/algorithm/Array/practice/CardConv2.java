package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

public class CardConv2 {

    static int cardConv(int x, int r, char[] d) {
        int n = ((Integer) x).toString().length(); // 변환 전의 자릿수
        int digits = 0; // 진수로 나눴을때 나오는 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOQPRSTUVWXYZ";
        System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
        do {
            System.out.printf("   +");
            for (int i = 0; i < n + 2; i++)
                System.out.print('-');
            System.out.println();

            if (x / r != 0)
                System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
            else
                System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
            char temp = d[i]; // 를 역순으로 정렬
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int no; // 변환하고자 하고싶은 음이 아닌 정수
        int cd; // 몇 진수로 바꿀지 설정을 위한 변수
        int dno; // 자릿수
        char[] cno = new char[32];
        int retry; // 전체프로그램 재실행여부

        do{
            do {
                System.out.println("변환할 음이 아닌 정수를 입력해주세요");
                no = stdIn.nextInt();
            }while(no < 0);

            do{
                System.out.println("몇 진수로 바꾸실건가요");
                cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd +"진수로는");
            for(int i = dno - 1; i >= 0; i--)
                System.out.print(cno[i]);
            System.out.println("입니다");


                System.out.println("다시 프로그램을 실행하겠습니까(1. 예/ 2. 아니오");
                retry = stdIn.nextInt();

        }while(retry == 1);

    }
}
