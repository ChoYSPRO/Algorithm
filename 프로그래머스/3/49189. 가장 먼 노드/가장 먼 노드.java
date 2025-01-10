import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        List<Integer>[] graph = new LinkedList[n];
        for(int i  = 0; i < n; i++){
            graph[i] = new LinkedList<>();
        }
        int lenEdge = edge.length;
        for(int i = 0; i < lenEdge; i++){
            int num1 = edge[i][0] -1;
            int num2 = edge[i][1] -1;
            graph[num1].add(num2);
            graph[num2].add(num1);
        }
        List<Integer> queue = new LinkedList<>();
        queue.add(0);
        int[] distance = new int[n];
        while(!queue.isEmpty()){
            int now = queue.remove(0);
            while(!graph[now].isEmpty()){
                int num = graph[now].remove(0);
                queue.add(num);
                if(distance[num] == 0){
                    distance[num] = distance[now] + 1;
                }
            }
        }
               
        int max = distance[0];
        int cnt = 0;
        for(int i = 1;  i < n; i++){
            if(max < distance[i]){
                max = distance[i];
                cnt = 1;
            } else if (max == distance[i]){
                cnt++;
            } else {
                continue;
            }
            
        }
        
        int answer = cnt;
        return answer;
    }
}