package OneOnestart;

import java.util.*;

public class code_20211220 {

	public static void main(String[] args) {
		int[][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
		int characterX = 1;
		int characterY = 3;
		int itemX = 7;
		int itemY = 8;
		int answer = solution(rectangle,characterX,characterY,itemX,itemY);
		System.out.println(answer);
	}
	
	public static class Point{
		int row;
		int col;
		int dist;
		Point(int r, int c, int d){
			row = r;
			col = c;
			dist = d;
		}
	}
	
	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,1,-1};
	
	public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = Integer.MAX_VALUE;
        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;
        int[][] map = new int[130][103];
        boolean[][] visited = new boolean[103][103];
        
        for(int i=0; i<rectangle.length; i++) {
        	int sr = rectangle[i][0]*2;
        	int er = rectangle[i][2]*2;
        	int sc = rectangle[i][1]*2;
        	int ec = rectangle[i][3]*2;
        	
        	for(int j=sr+1; j<er; j++) {
        		for(int k=sc+1; k<ec; k++) {
            		map[j][k] = 0;
            	}
        	}
        	
        	for(int j=sr; j<=er; j++) {
        		map[j][sc] = 1;
        		map[j][ec] = 1;
        	}
        	
        	for(int j=sc; j<=ec; j++) {
    			map[sr][j] = 1;
        		map[er][j] = 1;
        	}
        }
        
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(characterX,characterY,0));
        visited[characterX][characterY] = true;
        
        while(!q.isEmpty()) {
        	Point now = q.poll();
        	if(now.row == itemX && now.col == itemY) {
        		answer = Math.min(answer, now.dist);
        		break;
        	}
        	for(int i=0; i<4; i++) {
        		int nr = now.row + dr[i];
        		int nc = now.col + dc[i];
        		if(nr > 50 || nr < 0 || nc > 50 || nc < 0) continue;
        		if(visited[nr][nc] || map[nr][nc] == 0) continue;
        		visited[nr][nc] = true;
        		q.offer(new Point(nr,nc,now.dist+1));
        	}
        }
        
        return answer/2;
    }
	
}
