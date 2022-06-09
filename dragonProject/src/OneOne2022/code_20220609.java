package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220609 {

/**
5
1
5
3
8
2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr =new int[N];
        int answer = 0;

        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());

        boolean sorted = false;
        while(!sorted){
            sorted = true;
            answer++;
            for(int i=0; i<N-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println(answer);
    }
}
