package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

public class CardConvRevQ7 {

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print(r+"|          " + x);
        System.out.println();
        System.out.println(" +  --------------");
        do{

            d[digits++] = dchar.charAt(x % r);
            x /= r;
            System.out.print(r + "|          " + x + " ...... " + (x % r));
            System.out.println();
            System.out.println(" +  --------------");


        }while(x != 0);
        return digits;
    }

    public static void main(String[] args) {

        int no; //변환할 음이 아닌 정수
        int cd; //기수
        char[] cno = new char[32];
        int dno; //자릿수
        int retry; //다시한번더?

        Scanner stdIn = new Scanner(System.in);

        do {
            do{
                System.out.println("기수로 변환할 음이 아닌 정수를 입력해주세요");
                no = stdIn.nextInt();
            }while(no < 0);

            do{
                System.out.println("어떤 진수로 변환할까요?");
                cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd+"진수로는: ");
            for(int i = dno - 1; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다/");

            System.out.println("프로그램을 재실행하시겠습니까?? (예 : 1 / 아니오 : 2)");
            retry = stdIn.nextInt();
        }while(retry == 1);

    }
}
