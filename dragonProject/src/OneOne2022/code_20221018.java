package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221018 {
//2891

/**
5 2 1
2 4
3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int answer = 0;

        Arrays.fill(arr,1);

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<s; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[temp-1]--;
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<r; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[temp-1]++;
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                if(i>0 && arr[i-1] > 1){
                    arr[i]++;
                    arr[i-1]--;
                }else if(i<n-1 && arr[i+1] > 1){
                    arr[i]++;
                    arr[i+1]--;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] == 0) answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
