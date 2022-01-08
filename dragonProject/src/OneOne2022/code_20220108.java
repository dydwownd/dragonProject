package OneOne2022;

public class code_20220108 {

	public static void main(String[] args) {
		int[] money = {1, 2, 3, 1};
		System.out.println(solution(money));
	}
	
	public static int solution(int[] money) {
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];
        
        dp1[0] = money[0];
        dp1[1] = Math.max(money[0], money[1]);
        
        dp2[0] = 0;
        dp2[1] = money[1];
        
        for(int i=2; i<money.length-1; i++) {
        	dp1[i] = Math.max(dp1[i-1], dp1[i-2]+money[i]);
        }
        
        for(int i=2; i<money.length; i++) {
        	dp2[i] = Math.max(dp2[i-1], dp2[i-2]+money[i]);
        }
        
        
        return Math.max(dp1[money.length-2], dp2[money.length-1]);
    }
	
}
