package com.aiden.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int solution(String s) {
        int answer = 0;
       //1478 or one4seven8
        String[] num = new String[]{"zero","one", "two", "three", "four" , "five", "six", "seven", "nine"};
        for(int i = 0; i < num.length; i++) {
            s = s.replaceAll(num[i],String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        System.out.println("answer" + answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution2 so = new Solution2();
        so.solution("one234");

    }
}
