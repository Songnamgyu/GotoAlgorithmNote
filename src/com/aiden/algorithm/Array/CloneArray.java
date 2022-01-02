package com.aiden.algorithm.Array;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55};

        // b는 a의 복제를 참조
        int[] b = a.clone();
        // a에 데이터가 b에 잘 복사되었는지 확인해보기
        for(int i = 0; i < b.length; i++){
            System.out.println("b의 Array값 확인하기  \n" + "b["+i+"] : " + b[i] );
        }
        System.out.print("a = ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\nb = ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
        }
    }
}
