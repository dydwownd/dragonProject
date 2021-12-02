package algorithm;

import java.util.*;

//최소 공통 조상

public class Lca {

	public static void main(String[] args) {
		int n = 16;
		int[][] graph = {{1,14},{8,15},{10,16},{5,9},{4,6},{8,4},{4,10},{1,13},{6,15},{10,11},{6,7},{10,2},{16,3},{8,1},{16,12}};
		int[][] target = {{16,7}};
		
		solution(n,graph,target);
	}
	
	static int N;//정점개수
	static int a;//타켓1
	static int b;//타켓2
	static int[] parent;//부모 정보

	private static void solution(int n, int[][] graph, int[][] target) {
		N = n;
		parent = new int[n+1];
		a = target[0][0];
		b = target[0][1];
		
		for(int i=0; i<graph.length; i++) {
			parent[graph[i][1]] = graph[i][0];
		}
		
		int aDepth = getDepth(a);
		int bDepth = getDepth(b);
		
		int result = lca(a,aDepth,b,bDepth);
		
		System.out.println(result);
	}

	private static int lca(int a, int aDepth, int b, int bDepth) {
		if(aDepth>bDepth) {
			while(aDepth != bDepth) {
				aDepth--;
				a = parent[a];
			}
		}else {
			while(aDepth != bDepth) {
				bDepth--;
				b = parent[b];
			}
		}

		while(a != b) {
			a = parent[a];
			b = parent[b];
		}
		
		return a;
	}

	private static int getDepth(int num) {
		int idx = 0;
		while(num != 0) {
			idx++;
			num = parent[num];
		}
		return idx-1;
	}
	
}
