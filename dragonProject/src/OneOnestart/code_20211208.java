package OneOnestart;

import java.util.Arrays;

public class code_20211208 {

	public static void main(String[] args) {
		int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		int k = 3;
		int answer = solution(stones,k);
		System.out.println(answer);
	}
	
	public static int solution(int[] stones, int k) {
        int min = 0;
        int max = 0;
        min = Arrays.stream(stones).min().getAsInt();
        
        while(max < k) {
        	max = 0;
        	for(int i=0; i<stones.length; i++) {
        		if(stones[i]-min <= 0) max++;
        		else max=0;
        		if(max >= k) break;
        	}
        	if(max < k) min++;
        }
        
        return min;
    }
	
}
