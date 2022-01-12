package OneOne2022;

import java.util.*;

public class code_20220112 {

    public static void main(String[] args) {
        int n = 2, m = 2;
        int x = 0, y = 0;
        int[][] queries = {{2,1},{0,1},{1,1},{0,1},{2,1}};
        System.out.println(solution(n,m,x,y,queries));
    }

    public static class Point{
        int row;
        int col;
        Point(int r, int c){
            row = r;
            col = c;
        }
    }

    static int[] dr = {0,0,-1,1};
    static int[] dc = {-1,1,0,0};

    public static long solution(int n, int m, int x, int y, int[][] queries) {
        long answer = 0;
        Queue<Point> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                q.add(new Point(i,j));
            }
        }

        while(!q.isEmpty()){
            Point now = q.poll();

            for(int i=0; i<queries.length; i++){
                now.row += (dr[queries[i][0]]*queries[i][1]);
                now.col += (dc[queries[i][0]]*queries[i][1]);
                if(now.row < 0)  now.row = 0;
                if(now.row > n-1)  now.row = n-1;
                if(now.col < 0)  now.col = 0;
                if(now.col > m-1)  now.col = m-1;
            }
            if(now.row == x && now.col == y) answer++;
        }

        return answer;
    }

}
