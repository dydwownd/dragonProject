package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220924 {
//11509

/**
5
2 1 5 4 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int[] height = new int[1000002];
        int answer = 0;
        int now = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            now = arr[i];
            height[now]++;
            if(height[now+1] == 0){
                answer++;
            }else{
                height[now+1]--;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
