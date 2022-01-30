package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

public class cardConRevQ6 {

    static int cardConv(int x , int r , char[] d) {
        int digits = 0 ;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while( x != 0);

        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; //기수로 변환할 수
        int cd; //기수 ( 2~ 36)
        int dno; // 자릿수
        char[] cno = new char[32]; //변환될 수
        int retry; //  프로그램 재실행 여부


        do{
            do {
                System.out.println("변환할 음이아닌 정수를 입력해주세요");
                no = stdIn.nextInt();
            }while(no < 0);


            do{
                System.out.println("변환할 기수를 입력해주세요 ( 2 ~ 36 ) ");
                cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            System.out.print("변환된 기수로는 :");
            dno = cardConv(no, cd, cno);
            for(int i = 0 ; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.println("프로그램을 재 실행하시겠습니다(예 : 1 / 아니오 2)");

            retry = stdIn.nextInt();
        }while(retry ==  1);
    }
}
