package OneOne2022;
import java.io.*;
import java.util.Arrays;

public class code_20221105 {
//16678

/**
5
7
3
6
2
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        if(arr[0] != 1){
            answer += (arr[0]-1);
            arr[0] = 1;
        }

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                answer += (arr[i] - (arr[i-1]+1));
                arr[i] = arr[i-1]+1;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
