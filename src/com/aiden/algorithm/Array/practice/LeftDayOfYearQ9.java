package com.aiden.algorithm.Array.practice;

/*
*  des : y년 m월 d일의 그 해 남은일수 ( 12우러 31일이면 0 , 12월 30일이면 1 ) 를 구하는 아래 메서드를 작성하세요
*  author :  Aiden
*
* */

import java.util.Scanner;

public class LeftDayOfYearQ9 {

    static int[][] days = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, //평년
            {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };

    static int isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0 || y  % 400 == 0) ? 1 : 0;
    }

    static int leftDayOfYear(int y, int m , int d) {
        int creteriaDay;
        creteriaDay = days[isLeap(y)][m-1];
        int leftDays = creteriaDay - d;

        return leftDays;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry; // 다시한번?

        do {
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            System.out.printf("남은 일수는 %d일 입니다. \n",leftDayOfYear(year,month,day));

            System.out.println("한번 더 할 까요?? (예 : 1, 아니오 : 2)");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
