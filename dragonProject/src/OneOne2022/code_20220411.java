import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220411 {

/**
7
0 0 1 0 0 1 0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                arr[i] = 0;
                answer++;
                if(i < n-2){
                    if(arr[i+1] == 1) arr[i+1] = 0;
                    else arr[i+1] = 1;
                    if(arr[i+2] == 1) arr[i+2] = 0;
                    else arr[i+2] = 1;
                }else if(i == n-2){
                    if(arr[i+1] == 1) arr[i+1] = 0;
                    else arr[i+1] = 1;
                }
            }
        }

        System.out.println(answer);
    }

}
