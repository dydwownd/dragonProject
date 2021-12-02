package algorithm;

import java.util.*;

//경우의 수

public class Dfs {

	public static void main(String[] args) {
		int[][] data = {{1,2},{1,3},{2,3},{2,5},{3,4},{3,5},{4,5}};
		
		int num = 5;
		
		solution(data,num);
	}
	
	static List<String> list = new ArrayList<String>();
	static int[][] graph;
	static int n;

	public static void solution(int[][] data, int num) {
		
		n = num+1;
		graph = new int[n+1][n+1];
		boolean[] visited = new boolean[n+1];
		int len = data.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<len; i++) {
			graph[data[i][0]][data[i][1]] = 1;
			graph[data[i][1]][data[i][0]] = 1;
		}
		
		dfs(1,4,stack,visited);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	public static void dfs(int start, int end, Stack<Integer> stack, boolean[] visited) {
		
		visited[start] = true;
		stack.push(start);
		
		if(start == end) {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<stack.size(); i++) {
				str.append(stack.elementAt(i));
			}
			list.add(str.toString());
		}
		
		for(int i=0; i<n; i++){
			if(!visited[i] && graph[start][i] == 1){
				dfs(i,end,stack,visited);
				visited[i] = false;
			}
		}
		
		stack.pop();
		
	}
	
}
