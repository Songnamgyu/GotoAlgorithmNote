package com.aiden.algorithm.Array.practice;
/*
*  des : 1,000이하의 소수를 열거 (버전3)
*  writer : Aiden
* */

public class PrimeNumber3 {

    public static void main(String[] args) {

        int counter = 0 ; // 곱셈과 나눗셈의 횟수
        int ptr = 0 ; //찾은 소수의 갯수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 2는 소수임
        prime[ptr++] = 3; // 3은 소수임

        for(int n = 5; n <= 1000; n += 2) { // 대상은 홀수만
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++){
                counter +=2;
                if(n % prime[i] == 0) { //나누어떨어지면 소수가 아님
                    flag = true;
                    break;  // 떨어지면 더 이상 반복불필요
                }
            }

            if(!flag) {          // 마지막까지 나누어 떨어지지 않는다면
                prime[ptr++] = n; //소수라고 배열에 저장
                counter++;
            }
        }

        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter );
    }
}
