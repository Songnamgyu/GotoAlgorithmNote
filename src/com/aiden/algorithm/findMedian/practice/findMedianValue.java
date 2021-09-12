package com.aiden.algorithm.findMedian.practice;

public class findMedianValue {

    public static void main(String[] args) {
        System.out.println("median(3,2,1) = " + median(3,2,1)); //[A] a > b > c
        System.out.println("median(3,2,2) = " + median(3,2,2)); //[B] a > b = c
        System.out.println("median(3,1,2) = " + median(3,1,2)); //[C] a > c > b
        System.out.println("median(3,2,3) = " + median(3,2,3)); //[D] a = b > c
        System.out.println("median(3,2,3) = " + median(2,1,3)); //[E] c > a > b
        System.out.println("median(3,3,2) = " + median(3,3,2)); //[F] a = b > c
        System.out.println("median(3,3,3) = " + median(3,3,3)); //[G] a = b = c
        System.out.println("median(2,2,3) = " + median(2,2,3)); //[H] c > a = b
        System.out.println("median(2,3,1) = " + median(2,3,1)); //[I] b > a > c
        System.out.println("median(2,3,2) = " + median(2,3,2)); //[J] b > a = c
        System.out.println("median(1,3,2) = " + median(1,3,2)); //[K] b > c > a
        System.out.println("median(2,3,3) = " + median(2,3,3)); //[L] b = c > a
        System.out.println("median(1,2,3) = " + median(1,2,3)); //[M] c > b > a
    }
    static int median(int a, int b, int c) {
        if(a >= b)
            if(b >= c)
                return b;
            else if(c >= a)
                return a;
            else
                return c;
         else if( a > c)
                return a;
         else if( b > c)
                return c;
         else
                return b;
    }
}
