package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221122 {
//22993

/**
5
2 1 2 3 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n-1];
        long answer = 0;
        boolean checked = true;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        answer = Integer.parseInt(st.nextToken());

        for(int i=0; i<n-1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(answer < arr[i]){
                checked = false;
                break;
            }
            if(answer > arr[i]){
                answer += arr[i];
            }
        }

        bw.write(checked?"Yes":"No" + "\n");
        bw.close();
        br.close();
    }
}
