import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);        
        int head = score.length;       
        while(true){
            head -= m;
            if(head < 0) break;
            answer += m * score[head];
        }
        return answer;
    }
}