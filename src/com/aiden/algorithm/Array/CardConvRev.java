package com.aiden.algorithm.Array;

import java.util.Scanner;

// 입력받은 10진수를 2진수~36진수로 기수 변환하여 나타냄
public class CardConvRev {

    //정숫값 x를 r진수로 변환하여 배열d에 아랫자리부터 넣어두고 자릿수를 반환합니다
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);  //r로 나눈나머지를 저장
            x /= r;
        }while(x != 0);
        return digits;
    }

    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);

      int no; //변환하는정수
      int cd; //기수
      int dno; //변환 후의 자릿수
      int retry; //다시한번?
      char[] cno = new char[32]; //변환 후 각자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10 진수를 기수 변환합니다");
        do {
            do{
                System.out.println("음이아닌 정수");
                no = stdIn.nextInt();
            }while(no < 0);

            do{
                System.out.print("어떤 진수로 변환할까요? (2 ~36): ");
                cd = stdIn.nextInt();
            }while( cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno); // no를 cd 진수로 변환

            System.out.print(cd + "진수로는");
            for(int i = dno-1; i >= 0; i--)
                System.out.print(cno[i]);
                System.out.println("입니다");
                System.out.print("한번 더 해볼까요? (1.예/ 0.아니오) :");
                retry = stdIn.nextInt();

        }while(retry == 1);
    }
}
