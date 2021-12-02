package Study;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class FarNode {

	public static void main(String[] args) {
		
		int n = 6;
		int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		
		int answer = solution(n, vertex);
		
		System.out.println(answer);
	}

	private static int solution(int n, int[][] vertex) {
		int answer = 0;
		
		int[][] graph = new int[n+1][n+1];
		int[] dist = new int[n+1];
		boolean[] visited = new boolean[n+1];
		int max = 0;
		
		for(int i=0; i<vertex.length; i++) {
			graph[vertex[i][0]][vertex[i][1]] = 1;
			graph[vertex[i][1]][vertex[i][0]] = 1;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(1);
		visited[1] = true;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			for(int i=1; i<=n; i++) {
				if(!visited[i] && graph[node][i] == 1) {
					q.offer(i);
					dist[i] = dist[node]+1;
					visited[i] = true;
				}
			}
		}
		
		Arrays.sort(dist);
		
		for(int i=1; i<=n; i++) {
			if(dist[i] == dist[n-1]) answer++;
		}
		
		return answer;
	}

	
}
