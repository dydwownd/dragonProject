package OneOne2022;

public class code_20220106 {

	public static void main(String[] args) {
		System.out.println(solution(4));
	}
	
	public static int solution(int n) {

		int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<=n; i++) {
        	dp[i] = (dp[i-2] + dp[i-1])%1000000007;
        }
        
        return dp[n];
    }
	
}
