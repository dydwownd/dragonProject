package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220503 {

/**
5
2 2 3 3 3
3 3 1 2 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1000001];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[Integer.parseInt(st.nextToken())]++;
        }

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(arr[temp] > 0) arr[temp]--;
            else answer++;
        }

        System.out.print(answer);
    }
}
