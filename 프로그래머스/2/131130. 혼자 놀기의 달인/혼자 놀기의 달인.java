import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int n = cards.length;
        boolean[] visited = new boolean[n];
        ArrayList<Integer> groups = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int now  = i;
            int cnt = 0;
            while(!visited[now]){
                cnt++;
                visited[now] = true;
                now = cards[now] - 1;
            }
            groups.add(cnt);        
        }
        Collections.sort(groups);
        int nGroups = groups.size();        
        
        int answer = (nGroups == 1 ? 0 : groups.get(n-1) * groups.get(n-2));
        return answer;
    }
}