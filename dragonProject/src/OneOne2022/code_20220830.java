package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220830 {
//2109

/**
7
20 1
2 1
10 3
100 2
8 2
5 20
50 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer st;
        long answer = 0;
        boolean[] visited = new boolean[10001];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> {if(o1[0]==o2[0]) return o1[1]-o2[1]; else return o2[0]-o1[0];});

        for(int i=0; i<n; i++){
            for(int j=arr[i][1]; j>0; j--){
                if(!visited[j]){
                    visited[j] = true;
                    answer += arr[i][0];
                    break;
                }
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}