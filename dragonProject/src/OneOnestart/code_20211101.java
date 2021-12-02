package OneOnestart;

public class code_20211101 {

	public static void main(String[] args) {
		int n = 15;
		int answer = solution(n);
		System.out.println(answer);
	}
	
	public static int solution(int n) {
        int answer = 1;
        
        for(int i=1; i<n; i++) {
        	int temp = i;
        	for(int j=i+1; j<n; j++) {
        		temp += j;
        		if(n == temp) answer++;
        		if(temp > n) break;
        	}
        }
        
        return answer;
    }
	
}
