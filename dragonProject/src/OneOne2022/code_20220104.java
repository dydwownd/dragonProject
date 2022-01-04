package OneOne2022;

public class code_20220104 {

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		System.out.println(solution(m,n,puddles));
	}
	
	public static int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n][m];
        map[0][0] = 1;
        
        for(int i=0; i<puddles.length; i++) {
        	map[puddles[i][0]][puddles[i][1]] = -1;
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		if(map[i][j] == -1) {
        			map[i][j] = 0;
        			continue;
        		}
        		if(i>0) map[i][j] += map[i-1][j];
        		if(j>0) map[i][j] += map[i][j-1];
        	}
        }
        
        return map[n-1][m-1];
    }
	
}
