package OneOnestart;

import java.util.*;

public class code_20211105 {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int answer = solution(citations);
		System.out.println(answer);
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++) {
        	int max = citations.length-i;
        	if(max <= citations[i]) {
        		answer = max;
        		break;
        	}
        }
        
        return answer;
    }
	
}
