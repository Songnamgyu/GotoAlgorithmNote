package com.aiden.algorithm.Array;
/*
*  des : 2행 4열의 2차원 배열
*  author :  Aiden
* */
public class Int2DArray {
    public static void main(String[] args) {
        int[][] x = new int[2][4]; //2차원 배열 선언

        x[0][1] = 37;
        x[0][3] = 54;
        x[1][2] = 65;

        for(int i = 0 ; i < 2; i++) { // 각 요소의 값을 출력 -> 2행 4열이니 처음에는 행 두번째는 열을 반복문을 통해서 값 출력
            for(int j = 0; j < 4; j ++) {
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
            }
        }
    }
}
