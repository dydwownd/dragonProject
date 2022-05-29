package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220529 {

/**
3
2
3
1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean checked = false;
        int temp = 0;
        do{
            checked = false;
            for(int i=0; i<N-1; i++) {
                if(arr[i] > arr[i+1]){
                    checked = true;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    answer += arr[i]+arr[i+1];
                }
            }
        }while (checked);

        System.out.print(answer);

    }
}
