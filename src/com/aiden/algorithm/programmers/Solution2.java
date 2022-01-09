package com.aiden.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int solution(String s) {
        int answer = 0;
       //1478 or one4seven8
        Map<String,Object> numKey = new HashMap<>();
        numKey.put("zero",0);
        numKey.put("one",1);
        numKey.put("two",2);
        numKey.put("three",3);
        numKey.put("four",4);
        numKey.put("five",5);
        numKey.put("six",6);
        numKey.put("seven",7);
        numKey.put("eight",8);
        numKey.put("nine",9);

        for(String test : numKey.keySet()) {
            if(s.contains(test)) {
                s = s.replace(test, ""+ numKey.get(test));
            }
        }
        System.out.println("123123123");
        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        Solution2 so = new Solution2();
        so.solution("one");
    }
}
