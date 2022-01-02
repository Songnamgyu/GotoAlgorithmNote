package com.aiden.algorithm.Array.practice;

//배열을 역순으로 정렬하는 프로그램
public class ReverseArray2 {

    // 순서를 바꿔주는 메소드
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    // print 메소드
    static void print(int[] a) {
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    // revesre메소드
    static void reverse(int[] a) {
        print(a);
        for(int i = 0; i < a.length/2; i++) {
            System.out.println("a["+i+"]과(와) " + "a["+(a.length - i -1)+"]를 교환합니다");
            swap(a, i, a.length-i-1);
            print(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 73, 2, -5, 42};

        reverse(a);
        System.out.println("역순 정렬을 마쳤습니다");
        }

}
