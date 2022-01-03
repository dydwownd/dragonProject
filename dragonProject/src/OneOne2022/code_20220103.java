package OneOne2022;

public class code_20220103 {

	public static void main(String[] args) {
		int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
		System.out.println(solution(sticker));
	}
	
	public static int solution(int sticker[]) {
		if(sticker.length == 1) return sticker[0];
        int[] dp1 = new int[sticker.length];
        int[] dp2 = new int[sticker.length];
        
        dp1[0] = sticker[0];
        dp1[1] = Math.max(sticker[0], sticker[1]);
        
        dp2[0] = 0;
        dp2[1] = sticker[1];
        
        for(int i=2; i<sticker.length-1; i++) {
        	dp1[i] = Math.max(dp1[i-1], dp1[i-2]+sticker[i]);
        }
        
        for(int i=2; i<sticker.length; i++) {
        	dp2[i] = Math.max(dp2[i-1], dp2[i-2]+sticker[i]);
        }
        
        return Math.max(dp1[sticker.length-2], dp2[sticker.length-1]);
    }
	
}
