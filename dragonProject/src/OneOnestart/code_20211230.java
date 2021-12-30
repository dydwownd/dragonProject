package OneOnestart;

import java.util.Arrays;

public class code_20211230 {

	public static void main(String[] args) {
		int n = 2;
		int s = 9;
		Arrays.stream(solution(n,s)).forEach(System.out::println);
	}
	
	public static int[] solution(int n, int s) {
		if(n>s) return new int[] {-1};
        int[] answer = new int[n];
        int val = s/n;
        Arrays.fill(answer, val);
        
        for(int i=0; i<s%n; i++) {
        	answer[n-1-i]++;
        }
        
        return answer;
    }
	
}
