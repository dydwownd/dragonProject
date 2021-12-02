package OneOnestart;

import java.util.*;

public class code_20211029 {

	public static void main(String[] args) {
		
		String dirs = "ULURRDLLU";
		int answer = solution(dirs);
		System.out.println(answer);
	}
	
	public static int solution(String dirs) {
        int answer = 0;
        boolean[][][][] visited = new boolean[11][11][11][11];
        int x = 5;
        int y = 5;
        
        for(char c : dirs.toCharArray()) {
        	int nx = x;
        	int ny = y;
        	
        	if(c == 'U') ny--;
        	else if(c == 'D') ny++;
        	else if(c == 'L') nx--;
        	else if(c == 'R') nx++;
        	
        	if(nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
        	
        	if(!visited[x][y][nx][ny]) answer++;
        	visited[x][y][nx][ny] = true;
        	visited[nx][ny][x][y] = true;
        	x = nx;
        	y = ny;
        }
        
        return answer;
    }
	
}
