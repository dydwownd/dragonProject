package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220625 {
//14943
/**
5
500 -200 -400 50 50
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        long answer = 0;
        int idx = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            if(arr[i] > 0){
                for(int j=idx; j<N; j++){
                    if(arr[j]<0){
                        if(arr[i] + arr[j] > 0){
                            arr[i] += arr[j];
                            answer += Math.abs(arr[j]*(j-i));
                            arr[j] = 0;
                        }else{
                            arr[j] += arr[i];
                            answer += Math.abs(arr[i]*(j-i));
                            idx = j;
                            arr[i] = 0;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
