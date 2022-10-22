package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221022 {
//13560

/**
4
0 2 1 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int sum = 0;
        boolean checked = false;

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum < (i+1)*i/2){
                checked = true;
                break;
            }
        }

        if(!checked && sum != n*(n-1)/2){
            checked = true;
        }

        bw.write(checked?"-1":"1" + "\n");
        bw.close();
        br.close();
    }
}
