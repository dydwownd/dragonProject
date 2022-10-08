package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221008 {
//18185

/**
3
1 0 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[100001];
        long answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){

            if(arr[i+1]>arr[i+2]){
                int a = Math.min(arr[i],arr[i+1]-arr[i+2]);
                answer += (5*a);
                arr[i] -= a;
                arr[i+1] -= a;

                int b = Math.min(arr[i],Math.min(arr[i+1],arr[i+2]));
                answer += (7*b);
                arr[i] -= b;
                arr[i+1] -= b;
                arr[i+2] -= b;

            }else{
                int b = Math.min(arr[i],Math.min(arr[i+1],arr[i+2]));
                answer += (7*b);
                arr[i] -= b;
                arr[i+1] -= b;
                arr[i+2] -= b;

                int a = Math.min(arr[i],arr[i+1]);
                answer += (5*a);
                arr[i] -= a;
                arr[i+1] -= a;
            }

            answer += (arr[i]*3);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
