
package OneOne2022;import java.io.*;
import java.util.StringTokenizer;

public class code_20220928 {
//17521

/**
10 24
5
7
5
4
2
7
8
5
3
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        long answer = Long.parseLong(st.nextToken());
        long cnt = 0;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        for(int i=0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                if(answer >= arr[i]){
                    cnt += answer/arr[i];
                    answer = answer%arr[i];
                }
            }else if(arr[i] > arr[i+1]){
                answer += cnt*arr[i];
                cnt = 0;
            }
        }

        answer += cnt*arr[n-1];

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
