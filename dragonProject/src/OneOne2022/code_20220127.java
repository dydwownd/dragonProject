package OneOne2022;
import java.util.*;

public class code_20220127 {

    static boolean[][] visited;
    static int[] dr = {1,2,-1,-2};
    static int[] dc = {2,1,-2,-1};
    static int result;
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N][M];
        result = 0;

        bfs(0,0);

        System.out.println(result);
    }

    private static void bfs(int row, int col) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});
        visited[row][col] = true;
        result++;

        while(!q.isEmpty()){
            int[] now = q.poll();

            for(int i=0; i<4; i++){
                int nr = now[0] + dr[i];
                int nc = now[1] + dc[i];
                if(nr > N-1 || nr < 0 || nc > M-1 || nc < 0) continue;
                if(visited[nr][nc]) continue;
                visited[nr][nc] = true;
                result++;
                q.offer(new int[]{nr,nc});
            }
        }

    }

}
