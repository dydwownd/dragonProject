package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220705 {
//16238
/**
5
1 10 4 10 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr =new int[N];
        int answer1 = 0;
        int answer2 = 0;
        int day = 0;

        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            if(arr[i]-day <= 1) continue;
            else {
                answer1 += (arr[i]-day);
                day++;
            }
        }

        day = 0;
        for(int i=N-1; i>=0; i--){
            if(arr[i]-day <= 1) continue;
            else {
                answer2 += (arr[i]-day);
                day++;
            }
        }

        System.out.println(Math.max(answer1,answer2));
    }
}
