package algorithm;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		int n =6;
		int[] times = {7,10};
		
		int answer = solution(n,times);
		
		System.out.println(answer);
	}

	private static int solution(int n, int[] times) {
		int len = times.length;
		
		Arrays.sort(times);
		
		int min = 1;
		int mid = 0;
		int max = times[len-1]*n;
		int answer = max;
		int sum = 0;
		
		while(min<=max) {
			mid = (min+max)/2;
			sum = 0;
			for(int i=0; i<len; i++) {
				sum += mid/times[i];
			}
			if(sum>=n) {
				if(answer > mid) {
					answer = mid;
				}
				max = mid-1;
			}else{
				min = mid+1;
			}
		}
		
		return answer;
	}
	
}
