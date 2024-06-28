package org.example;

public class Solution2 {

    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        }else if (num % n != 0){
            answer = 0;
        }
        return answer;
    }
}
