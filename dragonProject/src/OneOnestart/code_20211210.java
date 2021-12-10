package OneOnestart;

import java.util.*;

public class code_20211210 {

	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		int answer = solution(jobs);
		System.out.println(answer);
	}
	
	public static class Disk{
		int request;
		int process;
		Disk(int r, int p){
			request = r;
			process = p;
		}
	}
	
	public static int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        PriorityQueue<Disk> order = new PriorityQueue<>((a,b) ->a.request-b.request);
        PriorityQueue<Disk> work = new PriorityQueue<>((a,b) ->a.process-b.process);
        
        for(int i=0; i<jobs.length; i++) {
        	order.offer(new Disk(jobs[i][0],jobs[i][1]));
        }
        
        while(!order.isEmpty() || !work.isEmpty()) {
        	while(!order.isEmpty() && order.peek().request <= time) {
        		work.offer(order.poll());
        	}
        	      		
    		if(!work.isEmpty()) {
    			Disk temp  = work.poll();
    			time += temp.process;
    			answer += time-temp.request;
    		}else {
    			time++;
    		}
        }
        
        return answer/jobs.length;
    }
	
}
