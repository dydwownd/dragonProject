package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220629 {
//3216
/**
4
2 1
1 5
3 3
2 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        int answer = 0;
        int max = 0;
        int min = 0;
        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int D = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            arr[i][0] = D;
            arr[i][1] = V;
            arr[i][2] = D/V;
            max += V;
        }

        Arrays.sort(arr,(o1, o2) -> o2[2]-o1[2]);

        answer = max;
        while(min<=max){
            int mid = (max+min)/2;
            int temp = mid;
            int value = 0;
            boolean able = true;

            for(int i=0; i<N; i++){
                if(temp > 0){
                    if(temp >= arr[i][1]){
                        value += arr[i][0];
                        temp -= arr[i][1];
                    }else{
                        value += arr[i][0];
                        arr[i][1] -= temp;
                        temp = 0;
                        value -= arr[i][1];
                    }
                }else{
                    if(value >= arr[i][1]){
                        value -= arr[i][1];
                        value += arr[i][0];
                    }else{
                        able = false;
                        break;
                    }
                }
            }

            if(able){
                answer = Math.min(mid,answer);
                max = mid-1;
            }else{
                min = mid+1;
            }

        }

        System.out.println(answer);
    }
}