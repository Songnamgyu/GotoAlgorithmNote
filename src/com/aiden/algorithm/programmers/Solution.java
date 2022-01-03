package com.aiden.algorithm.programmers;

import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1단계 대문자 > 소문자 치환
        new_id = new_id.toLowerCase();
        //2단계 알파벳 소문자, 숫자 빼기, 밑줄 , 마침표 제외한 조건 구하기
        for(int i = 0; i < new_id.length(); i++) {
            char a = new_id.charAt(i);
            if((a >= 97 && a <=122) || (a >=48 && a<=57) ||
                    a == '-' || a =='_' || a == '.') {
                answer += a;
            }
        }
        //3단계 .. 체크
        while(answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(answer.length() > 0) {
            if(answer.startsWith(".")) answer = answer.substring(1);
        }
        if(answer.length() > 0) {
            if(answer.endsWith(".")) answer = answer.substring(0,answer.length() -1);
        }
        //5단계 answer값이 빈값이라면
        if(answer.equals("")) {
            answer = "a";
        }
        //6단계 answer의 길이가 16보다 크다면
        if(answer.length() >= 16) {
            answer = answer.substring(0,15);
        }
        //answer의 마지막글자가 "."라면
        if(answer.endsWith(".")) {
            answer = answer.substring(0,14);
        }
        //7단계 answer의 길이가 2보다작으면 마지막글자를 길이가3이될때까지 붙여준다
        if(answer.length() <= 2) {
            char tmp = answer.charAt(answer.length()-1);
            while(answer.length() < 3) {
                answer += tmp;
            }
        }


        return answer;
    }

}
