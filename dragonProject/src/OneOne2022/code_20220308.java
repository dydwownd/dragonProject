package OneOne2022;
import java.util.Scanner;

public class code_20220308 {

/**
4 4
1 2 4 6
16 9 13 11
5 10 8 15
12 14 7 3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int max = 0;
        int idx = -1;
        int answer = 0;

        for(int i=0; i<n; i++){
            max = 0;
            idx = -1;
            for(int j=0; j<m; j++) {
                graph[i][j] = sc.nextInt();
                if(graph[i][j] > max){
                    max = graph[i][j];
                    idx = j;
                }
            }
            visited[i][idx] = true;
        }

        for (int j=0; j<m; j++) {
            max = 0;
            idx = -1;
            for(int i=n-1; i>=0; i--) {
                if(graph[i][j] > max){
                    max = graph[i][j];
                    idx = i;
                }
            }
            visited[idx][j] = true;
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j]) answer += graph[i][j];
            }
        }

        System.out.println(answer);

    }

}
