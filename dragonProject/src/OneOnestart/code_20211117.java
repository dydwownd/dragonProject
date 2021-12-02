package OneOnestart;

import java.util.Arrays;

public class code_20211117 {

	public static void main(String[] args) {
		int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
		int answer = solution(routes);
		System.out.println(answer);
	}
	
	public static int solution(int[][] routes) {
        int answer = 0;
        int min = Integer.MIN_VALUE;
        
        Arrays.sort(routes, (o1, o2) -> o1[1]-o2[1]);
        
        for(int i=0; i<routes.length; i++) {
        	if(min < routes[i][0]) {
        		min = routes[i][1];
        		answer++;
        	}
        }
        
        return answer;
    }
	
}
