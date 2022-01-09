package com.aiden.algorithm.Array;

// 1000 이하의 소수를 열거 (버전 1)
public class PrimeNumber1 {

    public static void main(String[] args) {
        int counter = 0; //나눗셈의 횟수

        for(int n = 2; n <= 1000; n++) {
            int i;
            for(i = 2; i < n; i++) {
                counter++;
                if(n % i == 0) // 나누어떨어지면 소수아님
                    break;  // 더 이상의 반복 불필요
            }
            // 마지막까지 for문을 하고나면 i++로 인해 i랑 n이랑 같아짐
            if( n == i) //마지막까지 나누어 떨어지지 않음
                System.out.println(n);
        }
        System.out.println("counter : " + counter);

    }


}