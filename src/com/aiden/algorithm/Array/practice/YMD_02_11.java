package com.aiden.algorithm.Array.practice;
/*
 *  book :  Do it 자료구조와 함께 배우는 알고리즘 입문(JAVA)
 *  des :  서기 년월일을 필드로 갖는 클래스를 만들기 (p93) 연습문제 11
 *  author : Aiden
 * */

import java.util.Scanner;

public class YMD_02_11 {

    int y; //년도
    int m; //월
    int d; //일

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0);
    }

    YMD_02_11(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    YMD_02_11 after(int n) {
        YMD_02_11 temp = new YMD_02_11(this.y, this.m, this.d);

        if (n < 0)
            return (before(-n));

        temp.d += n;

        while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
            temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
            if (++temp.m > 12) {
                temp.y++;
                temp.m = 1;
            }
        }
        return temp;
    }

    YMD_02_11 before(int n) {
        YMD_02_11 temp = new YMD_02_11(this.y, this.m, this.d);

        if(n < 0)
            return (after(-n));

        temp.d -= n;

        while(temp.d < 1) {
            if(--temp.m < 1){
                temp.y--;
                temp.m = 12;
            }
            temp.d += mdays[isLeap(temp.y)][temp.m - 1];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int year;
        int month;
        int days;
        System.out.println("년도를 입력해주세요");
        year = stdIn.nextInt();
        System.out.println("월을 입력해주세요");
        month = stdIn.nextInt();
        System.out.println("일을 입력해주세요");
        days = stdIn.nextInt();

        YMD_02_11 date = new YMD_02_11(year,month,days);

        System.out.println("몇일 앞/뒤 날짜를 구할까요?");
        int n = stdIn.nextInt();

        YMD_02_11 d1 = date.after(n);
        System.out.printf("%d일 뒤에날짜는 %d년%d월%d일 입니다\n",n, d1.y,d1.m,d1.d);

        YMD_02_11 d2 = date.before(n);
        System.out.printf("%d의 앞에날짜는 %d년%d월%d일 입니다\n",n, d2.y,d2.m,d2.d);



    }
}
