package algorithm;

import java.util.*;

//а╤гу

public class nCr {

	public static void main(String[] args) {
		int[] num = {1,9,2,4};
		int k = 2;
		
		int answer = solution(num, k);
		
		System.out.println(answer);
	}

	static List<Integer> list = new ArrayList<Integer>();
	
	private static int solution(int[] num, int k) {
		int answer = 0;
		
		int len = num.length;
		boolean[] visited = new boolean[len];
		
		nCr2(num,len,k,visited,0);
		
		for(int i : list) {
			answer = Math.max(answer, i);
		}
		
		return answer;
	}

	private static void nCr2(int[] num, int n, int r, boolean[] visited, int idx) {
		if(r==0) {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<n; i++) {
				if(visited[i]) {
					str.append(num[i]);
				}
			}
			list.add(Integer.parseInt(str.toString()));
		}else {
			for(int i=idx; i<n; i++) {
				visited[i] = true;
				nCr2(num,n,r-1,visited,i+1);
				visited[i] = false;
			}
		}
		
	}
	
}
