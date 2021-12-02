package OneOnestart;

public class code_20211107 {

	public static void main(String[] args) {
		
		int n = 5;
		int answer = solution(n);
		System.out.println(answer);
		
	}
	
	static int answer;
	
	public static int solution(int n) {
        answer = Integer.MAX_VALUE;

        dfs(n, 0);
        
        return answer;
    }

	private static void dfs(int n, int cnt) {
		if(n < 0) return;
		if(n == 0) {
			answer = Math.min(answer, cnt);
			return;
		}
		
		if(n%2 == 0) dfs(n/2, cnt);
		else dfs(n-1, cnt+1);
	}
	
}
