package OneOne2022;

import java.util.*;

public class code_20220101 {

	public static void main(String[] args) {
		int[] a = {-5,0,2,1,2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};
		System.out.println(solution(a,edges));
	}
	
	static ArrayList<ArrayList<Integer>> list;
	static boolean[] visited;
	static int[] indegree;
	static int[] A;
	static long answer;
	
	public static long solution(int[] a, int[][] edges) {
		answer = 0;
		
		list = new ArrayList<ArrayList<Integer>>();
		indegree = new int[a.length];
		visited = new boolean[a.length];
		A = a;
		
		for(int i=0; i<a.length; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<edges.length; i++) {
			list.get(edges[i][0]).add(edges[i][1]);
			list.get(edges[i][1]).add(edges[i][0]);
			indegree[edges[i][0]]++;
			indegree[edges[i][1]]++;
		}
		
		result();
		
		return answer;
	}

	private static void result() {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<indegree.length; i++) {
			if(indegree[i] == 1) q.offer(i);
		}
		
		while(!q.isEmpty()) {
			int num = q.poll();
			visited[num] = true;
			
			for(int i: list.get(num)) {
				if(!visited[i]) {
					indegree[i]--;
					if(indegree[i] == 1) q.offer(i);
					answer += Math.abs(A[num]);
					A[i] += A[num];
					A[num] = 0;
				}
			}
			
		}
		
	}
	
}
