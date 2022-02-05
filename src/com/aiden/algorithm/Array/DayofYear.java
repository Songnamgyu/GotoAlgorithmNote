package com.aiden.algorithm.Array;

import java.util.Scanner;

/*
*   des : 그 해 경과 일 수 구하기
*   author : Aiden
* */
public class DayofYear {

    //각 달 일수 (윤년이면 1, 평년이면 0을 반환할 수 있게 설정
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, //평년
            {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };

    //서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0 ;
    }

    // 서기 y년 m월 d일의 그 해 경과 일수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d; //일 수;

        for(int i = 1; i < m; i++) //1월~(m-1)월의 일수를 더 함
            days += mdays[isLeap(y)][i-1]; // 운년이면 isLeap(y) = 1; 평년이면 isLeap(y) = 0;
        return days;
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
