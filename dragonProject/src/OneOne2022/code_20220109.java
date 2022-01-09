package OneOne2022;

import java.util.LinkedList;
import java.util.Queue;

public class code_20220109 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
		System.out.println(solution(board));
	}
	
	static int[][] Board;
	static int n;
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	static int answer;
	
	public static class Point{
		int row;
		int col;
		int dist;
		int prog;
		Point(int r, int c, int d, int p){
			row = r;
			col = c;
			dist = d;
			prog = p;
		}
	}
	
	public static int solution(int[][] board) {
		answer = Integer.MAX_VALUE;
        Board = board;
        n = board.length;
        
        solve();
        
        return answer;
    }

	private static void solve() {
		Queue<Point> q = new LinkedList<>();
		int[][] minVal = new int[n][n];
		boolean[][] visited = new boolean[n][n];
		visited[0][0] = true;
		q.offer(new Point(0,0,0,-1));
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			if(now.row == n-1 && now.col == n-1) {
				answer = Math.min(answer, now.dist);
			}
			
			for(int i=0; i<4; i++) {
				int nr = now.row + dr[i];
				int nc = now.col + dc[i];
				int val = (now.prog == i) ? 100 : 600;
				if(now.prog == -1) val = 100;
				if(nr > n-1 || nr < 0 || nc > n-1 || nc <0 || Board[nr][nc] == 1) continue;
				
				if(!visited[nr][nc] || (visited[nr][nc] && minVal[nr][nc] > now.dist+val)) {
					minVal[nr][nc] = now.dist+val;
					visited[nr][nc] = true;
					q.offer(new Point(nr,nc,now.dist+val,i));
				}
				
			}
		}
		
	}
	
}
