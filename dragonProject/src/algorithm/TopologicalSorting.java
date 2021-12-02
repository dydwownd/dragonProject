package algorithm;

import java.util.*;

//위상정렬

public class TopologicalSorting {

	public static void main(String[] args) {
		int n = 3;
		int m = 2;
		int[][] graph = {{1,3},{2,3}};
		
		solution(n,m,graph);
	}

	static List<List<Integer>> list;
	
	private static void solution(int n, int m, int[][] graph) {
		list = new ArrayList<List<Integer>>();
		int[] indegree = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<graph.length; i++) {
			list.get(graph[i][0]).add(graph[i][1]);
			indegree[graph[i][1]]++;
		}
		
		topological(indegree);
	}
	
	public static void topological(int[] indegree) {
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> result = new LinkedList<Integer>();
		
		for(int i=1; i<indegree.length; i++) {
			if(indegree[i] == 0) q.offer(i);
		}
		
		while(!q.isEmpty()) {
			int num = q.poll();
			result.offer(num);
			
			for(int i : list.get(num)) {
				indegree[i]--;
				if(indegree[i] == 0) q.offer(i);
			}
		}
		
		while(!result.isEmpty()) {
			System.out.println(result.poll());
		}
	}
	
}
