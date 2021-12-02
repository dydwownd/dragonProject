package OneOnestart;

import java.util.*;

public class code_20211021 {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		int answer = solution(priorities,location);
		System.out.println(answer);
	}
	
	public static class Print{
		int idx;
		int order;
		Print(int i, int o){
			idx = i;
			order = o;
		}
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = priorities.length;
        Queue<Print> q = new LinkedList<>();
        PriorityQueue<Integer> order = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<priorities.length; i++) {
        	q.offer(new Print(i, priorities[i]));
        	order.offer(priorities[i]);
        }
        
        while(!q.isEmpty()) {
        	Print temp = q.poll();
        	if(temp.order == order.peek()) {
        		if(temp.idx == location) {
        			answer -= q.size();
        		}
        		order.poll();
        	}else {
        		q.offer(temp);
        	}
        }
        
        return answer;
	}
}
