package OneOnestart;

import java.util.*;

public class code_20211209 {

	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		String[] board = {"DBA", "C*A", "CDB"};
		String answer = solution(m,n,board);
		System.out.println(answer);
	}
	
	static char[][] map;
	static int M;
	static int N;
	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,1,-1};
	
	public static class Node{
		int row;
		int col;
		int dir;
		int dist;
		boolean cYn;
		Node(int r, int c, int d, int t, boolean y){
			row = r;
			col = c;
			dir = d;
			dist = t;
			cYn = y;
		}
	}

	public static String solution(int m, int n, String[] board) {
        StringBuilder answer = new StringBuilder();
        map = new char[m][n];
        M = m;
        N = n;
        char now;
        
        for(int i=0; i<board.length; i++) {
        	map[i] = board[i].toCharArray();
        }
        
        do{
        	now = ' ';
        	for(int i=0; i<M; i++) {
        		for(int j=0; j<N; j++) {
        			if(map[i][j] != '.' && map[i][j] != '*' && bfs(i,j)) {
        				if(now == ' ') now = map[i][j];
        				else now = map[i][j]<now ? map[i][j] : now;
        			}
        		}
        	}
        	
        	if(now != ' ') {
        		answer.append(now);
        		for(int i=0; i<M; i++) {
            		for(int j=0; j<N; j++) {
            			if(map[i][j] == now) map[i][j] = '.';
            		}
        		}
        	}
			
		}while(now != ' ' && now != '.');
                
        return "".equals(answer.toString()) ? "IMPOSSIBLE" : answer.toString();
    }
	
	private static boolean bfs(int i, int j) {
		
		boolean[][] visited = new boolean[M][N];
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(i,j,0,0,false));
		q.offer(new Node(i,j,1,0,false));
		q.offer(new Node(i,j,2,0,false));
		q.offer(new Node(i,j,3,0,false));
		visited[i][j] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(node.dist > 0 && map[i][j] == map[node.row][node.col]) return true;
			
			for(int k=0; k<4; k++) {
				if(node.dir == k) {
					int nr = node.row+dr[k];
					int nc = node.col+dc[k];
					
					if(nr > M-1 || nr < 0 || nc > N-1 || nc < 0) continue;
					if(visited[nr][nc] || map[nr][nc] == '*' || (map[nr][nc] != '.' && map[nr][nc] != map[i][j])) continue;
					visited[nr][nc] = true;
					q.add(new Node(nr,nc,k,node.dist+1,node.cYn));
				}
			}
			
			if(!node.cYn && node.dist > 0) {
				for(int k=0; k<4; k++) {
					if(node.dir != k) {
						int nr = node.row+dr[k];
						int nc = node.col+dc[k];
						
						if(nr > M-1 || nr < 0 || nc > N-1 || nc < 0) continue;
						if(visited[nr][nc] || map[nr][nc] == '*' || (map[nr][nc] != '.' && map[nr][nc] != map[i][j])) continue;
						visited[nr][nc] = true;
						q.add(new Node(nr,nc,k,node.dist+1,true));
					}
				}
			}
			
		}
		
		return false;
	}
	
}
