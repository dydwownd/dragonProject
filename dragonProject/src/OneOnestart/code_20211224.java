package OneOnestart;

import java.util.*;

public class code_20211224 {

	public static void main(String[] args) {
		int[][] land = {{4, 4, 3}, {3, 2, 2}, { 2, 1, 0 }};
		int P = 5;
		int Q = 3;
		System.out.println(solution(land,P,Q));
	}
	
	public static long solution(int[][] land, int P, int Q) {
        long answer = Long.MAX_VALUE;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<land.length; i++) {
        	for(int j=0; j<land.length; j++) {
        		set.add(land[i][j]);
        	}
        }
                
        for(int key : set) {
			long result = 0;
			for(int i=0; i<land.length; i++) {
				for(int j=0; j<land.length; j++) {
					if(land[i][j] - key > 0) result+=(land[i][j] - key)*Q;
					else result+=(key - land[i][j])*P;
				}
			}
			answer = Math.min(answer, result);
        }
        
        return answer;
    }
	
}
