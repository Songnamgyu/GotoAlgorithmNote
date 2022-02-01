package com.aiden.algorithm.Array.practice;
/*
* des : 1,000 이하의 소수를 열거(버전1)
* writer : Aiden
* */
public class PrimeNumber01 {

    public static void main(String[] args) {

                int counter = 0; //나눗셈의 횟수

        for(int n = 2; n <= 1000; n++) {
            int i;
            for(i = 2; i < n; i++) {
                System.out.println("n : " + n);
                counter++;
                System.out.println("counter : " + counter);
                if(n % i == 0) //나누어 떨어지면 소수가 아니다!
                    break;
            }
            if(n == i) //마지막까지 나누어떨어지지 않음
                System.out.println("n : " + n);

        }
        System.out.println("나눗셈을 수행한 횟수 : " +  counter );

    }

}

