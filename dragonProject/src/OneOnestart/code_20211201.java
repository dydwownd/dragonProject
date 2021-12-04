package OneOnestart;

public class code_20211201 {

	public static void main(String[] args) {
		int N = 5;
		int number = 31168;
		int answer = solution(N,number);
		System.out.println(answer);
	}
	
	static int Number;
	static int answer;
	
	public static int solution(int N, int number) {
        answer = Integer.MAX_VALUE;
        Number = number;
        
        dfs(N,0,0);
        
        return answer == Integer.MAX_VALUE ? 8 : answer;
    }

	private static void dfs(int n, int cnt, int value) {
		if(cnt > 8 || value < 0) return;
		if(value == Number && answer > cnt) {
			answer = cnt;
			return;
		}
		for(int i=0; i<8; i++) {			
			dfs(n,cnt+1,value+n);
			dfs(n,cnt+1,value-n);
			dfs(n,cnt+1,value/n);
			dfs(n,cnt+1,value*n);
			value = n*10+n;
			cnt += 1;
		}
	}
	
}
