package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220612 {

/**
5
1 2 5 2 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[100001];
        int answer = 0;

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp==1){
                answer++;
            }
            else{
                if(arr[temp]>0){
                    arr[temp]--;
                }
                else{
                    answer++;
                    arr[temp] = temp-1;
                }
            }
        }

        System.out.println(answer);
    }
}
