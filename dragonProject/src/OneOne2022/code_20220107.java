package OneOne2022;

import java.util.*;

public class code_20220107 {

	public static void main(String[] args) {
		int[][] matrix_sizes = {{5,3},{3,10},{10,6}};
		System.out.println(solution(matrix_sizes));
	}
	
	public static int solution(int[][] matrix_sizes) {
        int answer = 0;
        int len = matrix_sizes.length;
        
        Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> num = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        num.offer(matrix_sizes[0][1]);
        num.offer(matrix_sizes[len-1][0]);
        
        for(int i=1; i<len-1; i++) {
        	if(!num.contains(matrix_sizes[i][0])) num.offer(matrix_sizes[i][0]);
        	if(!num.contains(matrix_sizes[i][1])) num.offer(matrix_sizes[i][1]);
        }
        
        for(int i=0; i<len; i++) {
        	q.offer(matrix_sizes[i][0]);
        	q.offer(matrix_sizes[i][1]);
        }
        
        while(!num.isEmpty()) {
        	int val = num.poll();
        	
        	for(int i=0; i<len-1; i++) {
        		int num1 = q.poll();
	        	int num2 = q.poll();
	        	if(val == num2) {
	        		int num3 = q.poll();
	        		int num4 = q.poll();
	        		answer += (num1*num2*num4);
	        		len--;
	        		q.offer(num1);
	        		q.offer(num4);
	        	}else {
	        		q.offer(num1);
	        		q.offer(num2);
	        	}
        	}
        }
        
        return answer;
    }
	
}
