package algorithm;

import java.util.*;

//최소신장비용

public class Kruskal {

	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		
		int answer = solution(n,costs);
		
		System.out.println(answer);
	}
	
	public static class Node{
		int start;
		int end;
		int value;
		public Node(int s, int e, int v) {
			start = s;
			end = e;
			value = v;
		}
	}

	private static int solution(int n, int[][] costs) {
		int answer = 0;
		int len = costs.length;
		List<Node> list = new ArrayList<Node>();
		int[] parents = new int[n];
		
		for(int i=0; i<len; i++) {
			Node nd = new Node(costs[i][0],costs[i][1],costs[i][2]);
			list.add(nd);
		}
		
		for(int i=0; i<n; i++) {
			parents[i] = i;
		}
		
		Collections.sort(list, new Comparator<Node>() {
			public int compare(Node a, Node b) {
				if(a.value == b.value) {
					return a.start - b.start;
				}else {
					if(a.value > b.value){
						return 1;
					}else {
						return -1;
					}
				}
			}
		});
		
		for(int i=0; i<len; i++) {
			Node nd = list.get(i);
			
			int a = nd.start;
			int b = nd.end;
			if(getParents(parents,a) == getParents(parents,b)) {
				continue;
			}else {
				unionParent(parents,a,b);
				answer += nd.value;
			}
		}
		
		return answer;
	}
	
	public static int getParents(int[] parents, int x) {
		if(parents[x] == x) {
			return x;
		}
		return getParents(parents, parents[x]);
	}
	
	public static void unionParent(int[] parents, int x, int y) {
		int a = getParents(parents, x);
		int b = getParents(parents, y);
		if(a>b) {
			parents[a] = b;
		}else {
			parents[b] = a;
		}
	}
	
}
