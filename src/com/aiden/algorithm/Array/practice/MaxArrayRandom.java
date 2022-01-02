package com.aiden.algorithm.Array.practice;

import java.util.Random;
import java.util.Scanner;

public class MaxArrayRandom {

    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) { max = a[i]; }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("가장 키 큰 사람의 키를 찾는 프로그램을 시작합니다");
        System.out.println("사람의 수를 랜덤으로 생성합니다");
        int num = rand.nextInt(20);
        System.out.println("랜덤으로 생성한 인원의 수는 : " + num + "명 입니다");
        int[] height = new int[num];
        System.out.println("랜덤으로 생성된 사람의 키는 아래와 같습니다");

        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height["+i+"] : " + height[i]);
        }
        System.out.println("가장 키 큰 학생의 키 는 : " + maxOf(height)+ "입니다");

    }
}
