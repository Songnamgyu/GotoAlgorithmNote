package com.aiden.algorithm.Array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
            return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);


        System.out.println("가장 큰 키를 구합시다");
        System.out.println("사람의 수를 입력해주세요");
        //int num = stdIn.nextInt();
        int num = 1+(int)Math.ceil(rand.nextInt(11));
        System.out.println("사람 수 : " + num);
        int[] height = new int[num];
        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("heigth["+i+"] : " + height[i]);
        }
        System.out.println("가장 큰 키는 : " + maxOf(height));
                
    }
}
