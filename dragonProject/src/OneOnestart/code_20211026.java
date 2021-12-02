package OneOnestart;

import java.util.*;

public class code_20211026 {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int answer = solution(arr);
		System.out.println(answer);
	}
	
	public static int solution(int[] arr) {
        int answer = arr[0];
                
        for(int i=1; i<arr.length; i++) {
        	int temp = calc(answer,arr[i]);
        	answer = answer*arr[i]/temp;
        }
        
        return answer;
    }

	private static int calc(int a, int b) {
		while(b!=0) {
			int c = a%b;
			a=b;
			b=c;
		}
		return a;
	}
}
