package OneOnestart;

import java.util.*;

public class code_20211022 {

	public static void main(String[] args) {
		int[] A = {1,2};
		int[] B = {3,4};
		
		int answer = solution(A,B);
		System.out.println(answer);
	}
	
	public static int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;
        
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<len; i++) {
        	answer += A[i]*B[len-i-1];
        }
        
        return answer;
    }
	
}
