package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221115 {
//6029

/**
25 5 2
2
14
11
21
17
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+2];
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
        arr[n-1] = d;

        Arrays.sort(arr);

        int left = 0;
        int right = d;

        while(left <= right){
            int mid = (left+right)/2;
            int sum = 0;
            int now = 0;
            for(int i=1; i<arr.length; i++){
                if(arr[i]-arr[now] <= mid){
                    sum++;
                }
                else{
                    now=i;
                }
            }
            if(sum > m){
                right = mid-1;
            }
            else{
                answer = Math.max(answer,mid);
                left = mid+1;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
