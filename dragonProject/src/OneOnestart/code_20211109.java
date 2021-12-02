package OneOnestart;

import java.util.*;

public class code_20211109 {

	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		int answer = solution(k,dungeons);
		System.out.println(answer);
	}
	
	static int[][] Dungeons;
	static int answer;
	
	public static int solution(int k, int[][] dungeons) {
		answer = 0;
        Dungeons = dungeons;
        
        dfs(k,dungeons.length,0,"",new boolean[dungeons.length]);
        
        return answer;
    }

	private static void dfs(int k, int n, int cnt, String value, boolean[] visited) {
		if(cnt == n) {
			answer = Math.max(answer, result(k,value));
			return;
		}else {
			for(int i=0; i<n; i++) {
				if(!visited[i]) {
					visited[i] = true;
					value += String.valueOf(i);
					dfs(k, n, cnt+1, value, visited);
					value = value.substring(0,value.length()-1);
					visited[i] = false;
				}
			}
		}
		
	}

	private static int result(int k, String value) {
		int cnt = 0;
		
		for(int i=0; i<value.length(); i++) {
			int idx = Integer.parseInt(value.substring(i, i+1));
			
			if(k >= Dungeons[idx][0]) {
				k -= Dungeons[idx][1];
				cnt++;
			}
		}
		return cnt;
	}

	
}
