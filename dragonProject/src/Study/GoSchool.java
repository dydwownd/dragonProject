package Study;

public class GoSchool {

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		
		long answer = solution(m, n, puddles);
		
		System.out.println(answer);
	}

	private static long solution(int m, int n, int[][] puddles) {
		long[][] graph = new long[n][m];
		
		for(int i=0; i<puddles.length; i++) {
			graph[puddles[i][0]][puddles[i][1]] = -1;
		}
		
		graph[0][0] = 1;//Áý
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(graph[i][j] == -1) {
					graph[i][j] = 0;
					continue;
				}
				
				if(i != 0) {
					graph[i][j] = (graph[i-1][j]+graph[i][j]) % 100000007;
				}
				
				if(j != 0) {
					graph[i][j] = (graph[i][j-1]+graph[i][j]) % 100000007;
				}
			}
		}
		
		return graph[n-1][m-1];
	}
	
}
