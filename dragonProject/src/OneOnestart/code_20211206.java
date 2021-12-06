package OneOnestart;

import java.util.Arrays;

public class code_20211206 {

	public static void main(String[] args) {
		
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int answer = solution(triangle);
		System.out.println(answer);
		
	}
	
	public static int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] result = new int[len][len];
        
        result[0][0] = triangle[0][0];
        
        for(int i=1; i<len; i++) {
        	result[i][0] = result[i-1][0]+triangle[i][0];
        	result[i][i] = result[i-1][i-1]+triangle[i][i];
        }
        
        for(int i=2; i<len; i++) {
        	for(int j=1; j<triangle[i].length-1; j++) {        		
        		result[i][j] = Math.max(result[i-1][j-1],result[i-1][j]) + triangle[i][j];
        	}
        }
        
        for(int i=0; i<triangle[len-1].length; i++) {
        	answer = Math.max(answer, result[len-1][i]);
        }
        
        return Arrays.stream(result[len-1]).max().getAsInt();
    }
	
}
