package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220621 {

/**
6
1 11
0 1 2 3 4 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int where = Integer.parseInt(st.nextToken());
            arr[where]++;
            for(int j=1; j<=R; j++){
                if(j>M) break;
                if(where+j > M-1) arr[(where+j)-M]++;
                else arr[where+j]++;

                if(where-j < 0) arr[M+(where-j)]++;
                else arr[where-j]++;
            }
        }

        for(int i=0; i<M; i++){
            if(arr[i] == 0) answer++;
        }

        System.out.println(answer);
    }
}
