package com.aiden.algorithm.Loop;

import java.util.Scanner;

public class Digit {
    
    //2자리 양수( 10 ~ 99 ) 를 입력하는 프로그램입니다.

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        System.out.println("2자리의 정수를 입력해주세요");
       
        
        do {
            System.out.println("입력 ");
            no = stdIn.nextInt();
        } while(no < 10 || no > 99);

        System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다");
    }
    
}
