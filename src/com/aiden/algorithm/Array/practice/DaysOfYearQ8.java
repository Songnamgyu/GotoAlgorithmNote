package com.aiden.algorithm.Array.practice;

/*
*  des : 메서드 dayOfYear를 변수 i와 day없이 구현하세요 while문을 사용하세요
*  author : Aiden
* */

import java.util.Scanner;

public class DaysOfYearQ8 {

    //각 달의 일 수
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, //평년
            {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };

    // 서기 year년은 윤달인가 (윤달 : 1  / 평년 : 0 )
    static int isLeap(int y) {
        return ( y % 4 == 0 && y % 100 !=0 || y % 400 == 0 ) ? 1 : 0;
    }
    //서기 y년 m월 d일의 그 해 경과 일 수를 구함
    //int i와 days를 사용하지말기
    static int dayOfYear(int y, int m , int d) {
        while (--m != 0)
            d += mdays[isLeap(y)][m - 1];
        return (d);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry; // 다시한번?

        do {
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            System.out.printf("그 해 %d일째 입니다. \n",dayOfYear(year,month,day));

            System.out.println("한번 더 할 까요?? (예 : 1, 아니오 : 2)");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
