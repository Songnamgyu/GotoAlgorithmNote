package com.aiden.algorithm.Loop;

public class Multi99Table {

    public static void main(String[] args) {
        System.out.println("곱셉표 출력");
        for(int i = 1; i <= 9; i++){
            System.out.println();
            for(int j = 1; j <= 9; j++){
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.println();
            }

        }
    }
}
