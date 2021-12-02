package algorithm;

import java.util.*;

//¼ø¿­

public class nPr {

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
		int[] result = new int[len];
		
		nPr2(num,len,k,visited,result,0);
		
		for(int i : list) {
			answer = Math.max(answer, i);
		}
		
		return answer;
	}

	private static void nPr2(int[] num, int n, int r, boolean[] visited, int[] result, int idx) {
		if(r==idx) {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<r; i++) {
				str.append(result[i]);
			}
			list.add(Integer.parseInt(str.toString()));
		}else {
			for(int i=0; i<n; i++) {
				if(!visited[i]) {
					visited[i] = true;
					result[idx] = num[i];
					nPr2(num,n,r,visited,result,idx+1);
					visited[i] = false;
				}
			}
		}
	}
	
}
