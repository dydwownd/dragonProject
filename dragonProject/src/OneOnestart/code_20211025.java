package OneOnestart;

import java.util.*;

public class code_20211025 {
	
	public static void main(String[] args) {
		int n = 8, a = 4, b = 7;
		int answer = solution(n,a,b);
		System.out.println(answer);
	}
	
	public static int solution(int n, int a, int b)
    {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		a--;
		b--;
		
		for(int i=0; i<n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			answer++;
			int size = q.size();
			if(size == 2) break;
			
			for(int i=0; i<size/2; i++) {
				int tempA = q.poll();
				int tempB = q.poll();
				if((tempA == a && tempB == b) || (tempA == b && tempB == a)) return answer;
				
				if(tempA == a || tempA == b){
					q.offer(tempA);
				}else {
					q.offer(tempA);
				}
			}
		}
		
        return answer;
    }
}
