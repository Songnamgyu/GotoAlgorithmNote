package com.aiden.algorithm.Array.practice;

import java.util.Scanner;

/*
 *  book :  Do it 자료구조와 함께 배우는 알고리즘 입문(JAVA)
 *  des :  신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
 *  author : Aiden
 * */
public class PhysicalExamination {

    static final int VMAX = 21; //시력분포(시력 0.0부터 0.1단위로 21개)

    static class PhyscData {
        String name;    //이름
        int height;     // 키
        double vision;   //시력

        //생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    //키의 평균값을 구함
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for(int i = 0 ; i < dat.length; i++)
            sum+= dat[i].height;

        return sum / dat.length;
    }

    // 시력 분포를 구함
    static void disVision(PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for(i = 0; i < dat.length; i++)
            if(dat[i].vision >= 0.0 && dat[i].vision <=VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("박현규", 162, 0.3),
                new PhyscData("함진아", 173, 0.7),
                new PhyscData("최은미", 175, 2.0),
                new PhyscData("홍연의", 171, 1.5),
                new PhyscData("이수진", 168, 0.4),
                new PhyscData("김영준", 174, 1.2),
                new PhyscData("박용규", 169, 0.8),
        };

        int[] vdist = new int[VMAX]; //시력분포

        System.out.println("ㅁ 신체검사 리스트 ㅁ");
        System.out.println("이름       키   시력");
        System.out.println("==================");
        for(int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height, x[i].vision);

        System.out.printf("\n평균키 : %5.1fcm\n", aveHeight(x));
        
        disVision(x,vdist); // 시력분포를 구함

        System.out.println("\n시력 분포");
        for(int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f~ :%2d명\n",i / 10.0, vdist[i]);

    }
}
