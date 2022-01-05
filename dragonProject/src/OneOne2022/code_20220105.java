package OneOne2022;

public class code_20220105 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,4,0,0,0},{0,0,0,0,0,4,4,0,0,0},{0,0,0,0,3,0,4,0,0,0},{0,0,0,2,3,0,0,0,5,5},{1,2,2,2,3,3,0,0,0,5},{1,1,1,0,0,0,0,0,0,5}};
		System.out.println(solution(board));
		
	}
	
	static int[][] Board;
	static int n;
	
	public static int solution(int[][] board) {
        int answer = 0;
        Board = board;
        
        n = board[0].length;
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(i < n-1 && j < n-2 && canFill23(i,j)) {
        			remove23(i,j);
        			answer++;
        			i=0;
        			j=0;
        		}
        		if(i < n-2 && j < n-1 && canFill32(i,j)) {
        			remove32(i,j);
        			answer++;
        			i=0;
        			j=0;
        		}
        	}
        }
        
        return answer;
    }

	private static boolean canFill23(int r, int c) {
		int zeroCnt = 0;
		int num = 0;
		for(int i=r; i<r+2; i++) {
        	for(int j=c; j<c+3; j++) {
        		if(Board[i][j] == 0) zeroCnt++;
        		else {
        			if(num != 0 && num != Board[i][j]) return false;
        			num = Board[i][j];
        		}
        	}
		}
		
		if(zeroCnt != 2) return false;
		
		for(int i=r+1; i<r+2; i++) {
        	for(int j=c; j<c+3; j++) {
        		for(int k=0; k<i; k++) {
        			if(Board[i][j] == 0 && Board[k][j] != 0) return false;
        		}
        	}
		}
		
		return true;
	}

	private static boolean canFill32(int r, int c) {
		int zeroCnt = 0;
		int num = 0;
		for(int i=r; i<r+3; i++) {
        	for(int j=c; j<c+2; j++) {
        		if(Board[i][j] == 0) zeroCnt++;
        		else {
        			if(num != 0 && num != Board[i][j]) return false;
        			num = Board[i][j];
        		}
        	}
		}
		
		if(zeroCnt != 2) return false;
		
		for(int i=r+1; i<r+3; i++) {
        	for(int j=c; j<c+2; j++) {
        		for(int k=0; k<i; k++) {
        			if(Board[i][j] == 0 && Board[k][j] != 0) return false;
        		}
        	}
		}
		
		return true;
	}

	private static void remove23(int r, int c) {
		for(int i=r; i<r+2; i++) {
        	for(int j=c; j<c+3; j++) {
        		Board[i][j] = 0;
        	}
		}
	}

	private static void remove32(int r, int c) {
		for(int i=r; i<r+3; i++) {
        	for(int j=c; j<c+2; j++) {
        		Board[i][j] = 0;
        	}
		}
	}

}
