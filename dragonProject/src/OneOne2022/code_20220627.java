package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class code_20220627 {
//17842
/**
9
1 2
6 7
8 2
4 5
3 4
2 6
0 3
5 8
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        int answer = 0;

        StringTokenizer st;
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }

        q.offer(0);
        visited[0] = true;

        while(!q.isEmpty()){
            answer = Math.max(answer,q.size());
            int now = q.poll();
            for(int i=0; i<N; i++){
                if(!visited[i] && map[now][i] == 1){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }

        System.out.println(answer);
    }
}
