package OneOnestart;

import java.util.*;

public class code_20211118 {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int answer = solution(people,limit);
		System.out.println(answer);
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
        
        Arrays.sort(people);
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int i=0; i<people.length; i++) {
        	list.offer(people[i]);
        }
        
        while(!list.isEmpty()) {
        	int temp = list.pollLast();
        	
        	if(!list.isEmpty() && (temp + list.peekFirst() <= limit)) {
        		list.pollFirst();
        	}
        	
        	answer++;
        }
        
        return answer;
    }
	
}
