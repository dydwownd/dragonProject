package algorithm;

import java.util.*;

//코사라주 알고리즘
//방향 그래프(Directed Graph) 에서 SCC (Strongly Connected Component) 를

public class StrongConnect {

	public static void main(String[] args) {
		int v = 7;
		int e = 9;
		int[][] node = {{1,4},{4,5},{5,1},{1,6},{6,7},{2,7},{7,3},{3,7},{7,2}};
		
		solution(v,e,node);
	}
	
	static ArrayList<ArrayList<Integer>> list;
	static ArrayList<ArrayList<Integer>> reverse;
	static ArrayList<ArrayList<Integer>> result;
	static Stack<Integer> stack;
	static boolean[] visited;

	private static void solution(int v, int e, int[][] node) {
		list = new ArrayList<ArrayList<Integer>>();
		reverse = new ArrayList<ArrayList<Integer>>();
		result = new ArrayList<ArrayList<Integer>>();
		stack = new Stack<Integer>();
		visited = new boolean[v+1];
		int num = 0;
		
		for(int i=0; i<=v; i++) {
			list.add(new ArrayList<Integer>());
			reverse.add(new ArrayList<Integer>());
			result.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<e; i++) {
			list.get(node[i][0]).add(node[i][1]);
			reverse.get(node[i][1]).add(node[i][0]);
		}
		
		for(int i=1; i<=v; i++) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		Arrays.fill(visited, false);
		
		while(!stack.isEmpty()) {
			int start = stack.pop();
			
			if(visited[start]) {
				continue;
			}
			
			reDfs(start,num);
			num++;
		}
		
		System.out.println(num);
		
		for(int i=0; i<result.size(); i++) {
			ArrayList<Integer> temp = result.get(i);
			Collections.sort(temp);
			for(int j : temp) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	private static void reDfs(int start, int num) {
		visited[start] = true;
		result.get(num).add(start);
		
		for(int i : reverse.get(start)) {
			if(!visited[i]) {
				reDfs(i,num);
			}
		}
	}

	private static void dfs(int start) {
		visited[start] = true;
		
		for(int i : list.get(start)) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		stack.push(start);
		
	}
	
}
