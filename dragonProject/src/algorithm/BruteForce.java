package algorithm;

//¿ÏÀüÅ½»ö

public class BruteForce {

	public static void main(String[] args) {
		int[][] tryangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		
		int answer = solution(tryangle);
		
		System.out.println(answer);
	}
	
	static int[][] Tryangle;

	private static int solution(int[][] tryangle) {
		int answer = 0;
		int len = tryangle.length;
		Tryangle = new int[len][len];
		Tryangle[0][0] = tryangle[0][0];
		
		for(int i=1; i<len; i++) {
			Tryangle[i][0] = Tryangle[i-1][0] + tryangle[i][0];
			Tryangle[i][i] = Tryangle[i-1][i-1] + tryangle[i][i];
		}
		
		for(int i=2; i<len; i++) {
			for(int j=1; j<i; j++) {
				Tryangle[i][j] = Math.max(Tryangle[i-1][j-1], Tryangle[i-1][j]) + tryangle[i][j];
			}
		}
		for(int i=0; i<len; i++) {
			answer = Math.max(answer, Tryangle[len-1][i]);
		}
		
		return answer;
	}
	
}
