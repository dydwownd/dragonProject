package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220414 {

/**
5
4 2 3 1 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        int cnt = 1;
        int answer = 1;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                cnt++;
                answer = Math.max(cnt,answer);
            }else{
                cnt = 1;
            }
        }

        System.out.println(answer);

    }

}
