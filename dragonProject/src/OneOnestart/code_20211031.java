package OneOnestart;

public class code_20211031 {

	public static void main(String[] args) {
		
		int brown = 10, yellow = 2;
		int[] answer = solution(brown,yellow);
		System.out.println(answer[0] + " " + answer[1]);
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        for(int i=3; i<=(brown+yellow)/3; i++) {
        	//i row¶ó¸é, j´Â col
        	for(int j=3; j<=(brown+yellow)/3; j++) {
        		int out = j+j+(i-2)+(i-2);
        		int in = (j-2)*(i-2);
        		if(out == brown && in == yellow) {
        			answer[0] = j;
        			answer[1] = i;
        			return answer;
        		}
        	}
        }
        
        return answer;
    }
	
}
