package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class code_20220528 {

/**
4
7 3 9 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        int answer = 1;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if(arr[0] == 0) System.out.print(0);
        else{
            int idx = 0;
            if(N%2 == 0) idx = N/2;
            else idx = N/2+1;
            for(int i=0; i<idx; i++){
                int cnt = 0;
                while(arr[i] > 1){
                    arr[i] /= 2;
                    cnt++;
                }
                answer += cnt;
            }

            System.out.print(answer);
        }

    }
}
