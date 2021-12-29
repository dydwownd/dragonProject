package OneOnestart;

public class code_20211229 {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}
	
	static int[][] map;
	static int answer;
	static int[] dr = {-1,-1,1,1,-1,1,0,0};
	static int[] dc = {-1,1,-1,1,0,0,-1,0};
	
	public static int solution(int n) {
        map = new int[n][n];
        answer = 0;
        
        dfs(0,n);
        
        return answer;
    }

	private static void dfs(int row, int n) {
		if(row == n) {
			answer++;
			return;
		}
		for(int i=0; i<n; i++) {
			if(isPossible(row,i,n)) {
				map[row][i] = 1;
				dfs(row+1,n);
				map[row][i] = 0;
			}
		}
	}

	private static boolean isPossible(int row, int col, int n) {
		
		for(int i=0; i<8; i++) {
			int r = row+dr[i];
			int c = col+dc[i];
			for(int j=0; j<n; j++) {
				if(r < 0 || c < 0 || r > n-1 || c> n-1) continue;
				if(map[r][c] == 1) return false;
				r+=dr[i];
				c+=dc[i];
			}
		}
		
		return true;
	}
	
}
