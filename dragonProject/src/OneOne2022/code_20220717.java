package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220717 {
//11047
/**
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i=n-1; i>=0; i--){
            if(arr[i]<=k){
                answer += k/arr[i];
                k = k%arr[i];
            }
        }

        System.out.println(answer);
    }
}
