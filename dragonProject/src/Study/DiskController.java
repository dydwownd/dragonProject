package Study;

import java.util.*;

public class DiskController {

	public static void main(String[] args) {
		int[][] jobs = {{0, 10}, {4, 10}, {15, 2}, {5, 11}}; //15
		
		//
		//
		//{{0, 10}, {4, 10}, {15, 2}, {5, 11}}; //15
		
		int answer = solution(jobs);
		
		System.out.println(answer);
	}
	
	private static int solution(int[][] jobs) {
		int len = jobs.length;
		
		Arrays.sort(jobs, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					if(a[1] == b[1]){
						return a[0] - b[0];
					}else {
						return a[1] - b[1];
					}
				}
		});

		int dist = jobs[0][0];
		int calc = 0;
		
		for(int i=0; i<len; i++) {
			dist += jobs[i][1];
			calc += (dist-jobs[i][0]);
		}
		
		return calc/len;
	}
	
	
}
