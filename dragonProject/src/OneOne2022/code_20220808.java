package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220808 {
//1080
/**
3 4
0000
0010
0000
1001
1011
1001
*/

    static int N;
    static int M;
    static int[][] arrA;
    static int[][] arrB;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arrA = new int[N][M];
        arrB = new int[N][M];
        answer = 0;

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                arrA[i][j] = Integer.parseInt(str.substring(j,j+1));
            }
        }

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                arrB[i][j] = Integer.parseInt(str.substring(j,j+1));
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i+2 < N && j+2 < M && arrA[i][j] != arrB[i][j]){
                    answer++;
                    goChange(i,j);
                }
            }
        }

        boolean isSame = true;

        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                if(arrA[i][j] != arrB[i][j]){
                    isSame = false;
                    break;
                }
            }
        }

        if(!isSame) answer = Integer.MAX_VALUE;

        System.out.println(answer==Integer.MAX_VALUE?-1:answer);
    }

    private static void goChange(int x, int y) {
        for(int i=x; i<=x+2; i++){
            for(int j=y; j<=y+2; j++) {
                if(arrB[i][j] == 0) arrB[i][j] = 1;
                else arrB[i][j] = 0;
            }
        }
    }
}
