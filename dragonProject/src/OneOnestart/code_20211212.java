package OneOnestart;

import java.util.Arrays;

public class code_20211212 {

	public static void main(String[] args) {
		int n = 2;
		int s = 9;
		int[] answer = solution(n,s);
		Arrays.stream(answer).forEach(System.out::println);
	}
	
	public static int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if(n > s) return new int[]{-1};
        
        Arrays.fill(answer, 0, n-(s%n), s/n);
        Arrays.fill(answer, n-(s%n), n, s/n+1);
        
        return answer;
    }
	
}
