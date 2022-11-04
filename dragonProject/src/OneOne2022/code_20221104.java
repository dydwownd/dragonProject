package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221104 {
//18186

/**
5 3 2
1 1 1 0 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        long answer = 0;
        int cnt = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        if(B>=C){
            for(int i=0; i<n; i++){
                int min = 0;
                if(i<n-2 && arr[i]>0 && arr[i+1]>0 &&arr[i+2]>0){
                    min = Math.min(arr[i],Math.min(arr[i+1],arr[i+2]));
                    if(cnt+min <= n){
                        answer += (min*(B+(2*C)));
                        arr[i] -= min;
                        arr[i+1] -= min;
                        arr[i+2] -= min;
                    }else{
                        answer += ((n-cnt)*(B+(2*C)));
                        arr[i] -= (n-cnt);
                        arr[i+1] -= (n-cnt);
                        arr[i+2] -= (n-cnt);
                    }
                }
                if(i<n-1 && arr[i]>0 && arr[i+1]>0){
                    min = Math.min(arr[i],arr[i+1]);
                    if(cnt+min <= n){
                        answer += (min*(B+C));
                        arr[i] -= min;
                        arr[i+1] -= min;
                    }else{
                        answer += ((n-cnt)*(B+C));
                        arr[i] -= (n-cnt);
                        arr[i+1] -= (n-cnt);
                    }
                }
                if(cnt == n) break;
            }
            if(cnt<n){
                for(int i=0; i<n; i++){
                    if(arr[i] + cnt <= n){
                        cnt += arr[i];
                        answer += arr[i]*B;
                    }else{
                        cnt += (n-cnt);
                        answer += ((n-cnt)*B);
                    }
                    if(cnt == n) break;
                }
            }
        }else{
            for(int i=0; i<n; i++){
                if(arr[i] + cnt <= n){
                    cnt += arr[i];
                    answer += arr[i]*B;
                }else{
                    cnt += (n-cnt);
                    answer += ((n-cnt)*B);
                }
                if(cnt == n) break;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
