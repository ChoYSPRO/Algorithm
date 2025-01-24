class Solution {
    public int solution(int n) {
        int preNum = 0, curNum = 1, tempNum = 0;
        for(int i = 1; i  < n; i++){
            tempNum = preNum + curNum;
            tempNum %= 1234567;
            preNum = curNum;
            curNum = tempNum;
        }
        int answer = 0;
        answer = tempNum;
        return answer;
    }
}