package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220613 {

/**
5 6
0 0 0 0 0 1
0 0 0 1 0 0
0 0 0 0 1 0
0 1 1 0 0 0
0 0 0 0 0 0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        int idx = M;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            int checked = 0;
            idx--;
            for(int j=0; j<M; j++){
                if(!visited[i][j]){
                    visited[i][j] = true;
                    if(map[i][j] == 1) checked++;
                }
            }
            if(idx>0){
                for(int k=0; k<N; k++){
                    if(!visited[k][idx]){
                        visited[k][idx] = true;
                        if(map[k][idx] == 1) checked++;
                    }
                }
            }
            if(checked>0) answer++;
        }

        System.out.println(answer);
    }
}
