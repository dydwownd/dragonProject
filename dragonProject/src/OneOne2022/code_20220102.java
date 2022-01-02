package OneOne2022;

import java.util.Arrays;

public class code_20220102 {

	public static void main(String[] args) {
		int n = 6;
		int[] times = {7,10};
		System.out.println(solution(n,times));
	}
	
	public static long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        
        Arrays.sort(times);
        
        long max = n*times[times.length-1];
        long min = 0;
        
        while(min <= max) {
        	long mid = (max+min)/2;
        	long sum = 0;
        	for(int i=0; i<times.length; i++) {
        		sum += mid/times[i];
        	}
        	
        	if(sum>=n) {
        		max = mid-1;
        		answer = mid;
        	}else {
        		min = mid+1;
        	}
        	
        }
        
        return answer;
    }

	
}
