package OneOnestart;

import java.util.*;

public class code_20211108 {

	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
		int asnwer = solution(people, limit);
		System.out.println(asnwer);
	}
	
	public static int solution(int[] people, int limit) {
        int start = 0;
        int end = people.length;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<people.length; i++) {
        	q.offer(people[i]);
        	rq.offer(people[i]);
        }
        
        while(start != end && !rq.isEmpty()) {
        	int temp = rq.poll();
        	start++;
        	
        	if(temp + q.peek() <= limit) {
        		q.poll();
        		end--;
        	}
        }
        
        return start;
    }
	
}
