package com.aiden.algorithm.Array;

import java.util.Scanner;

/*
*  des :  기수변한 프로그램 예제 연습 -> 입력받은 10진수를 2진수~36진수로 기수변환하여 나타내는거를 목적으로한다.
*  writer : aidenSong
* */
public class CardConvRev0 {
    // 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환하다.
     static int cardConvR(int x, int r, char[] d) {
         int digits = 0; // 변환 후의 자릿수
         String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

         do{
             d[digits++] = dchar.charAt(x % r);  //r로 나눈 나머지를 저장
             x /= r;
         }while (x != 0);

         return digits;
     }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;  // 변환하는 기수
        int cd;  // 기수
        int dno; // 변환 후의 자릿수
        int retry; //다시 한번 ?
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");

        do{

            do{
                System.out.println("변환하는 음이 아닌 정수");
                no = stdIn.nextInt();
            }while(no < 0);

            do{
                System.out.println("어떤진수로 변환할까요? (2 ~ 36) : ");
                 cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno); //no를 cd진수로 변환

            System.out.print(cd + "진수로는");
            for(int i = dno-1; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.print( "입니다.");
            System.out.println("한번더 할 까요? (1: 예 / 2 : 아니오 )");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
