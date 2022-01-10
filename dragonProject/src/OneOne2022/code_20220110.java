package OneOne2022;

import java.util.*;

public class code_20220110 {

	public static void main(String[] args) {
		int n = 7;
		int m = 10;
		int[][] edge_list = {{1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 6}, {5, 6}, {5, 7}, {6, 7}};
		int k = 6;
		int[] gps_log = {1, 2, 3, 3, 6, 7};
		System.out.println(solution(n,m,edge_list,k,gps_log));
	}
	
	static int[][] map;
	static int[] Gps_log;
	static int answer;
	static boolean[] visited;
	static int N;
	
	public static int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
        answer = 0;
        
        map = new int[n][n];
        visited = new boolean[k];
        Gps_log = gps_log;
        N = n;
        
        for(int i=0; i<m; i++) {
        	map[edge_list[i][0]-1][edge_list[i][1]-1] = 1;
        	map[edge_list[i][1]-1][edge_list[i][0]-1] = 1;
        }
        
        for(int i=1; i<k; i++) {
        	if(gps_log[i-1] != gps_log[i] && map[gps_log[i-1]-1][gps_log[i]-1] != 1) {
        		if(isErrorCnt(i)) return -1;
        	}
        }
        
        return answer;
    }

	private static boolean isErrorCnt(int idx) {
		int cnt = 0;
		for(int i=idx-1; i>=0; i--) {
			if(getDist(Gps_log[i]-1,Gps_log[idx]-1) <= cnt+1) {
				
				for(int k=idx-1; k>i; k--) {
					if(visited[k]) cnt--;
					if(!visited[k]) visited[k] = true;
				}
				
				answer += cnt;
				return false;
			}
			cnt++;
		}
		
		return true;
	}

	private static int getDist(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		boolean[] visit = new boolean[N];
		q.offer(new int[] {i,0});
		visit[i] = true;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			if(now[0] == j) return now[1];
			
			for(int k=0; k<N; k++) {
				if(!visit[k] && map[now[0]][k] == 1) {
					visit[k] = true;
					q.offer(new int[] {k,now[1]+1});
				}
			}
		}
		
		return -1;
	}

}
