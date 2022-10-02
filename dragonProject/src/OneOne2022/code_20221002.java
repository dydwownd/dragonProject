package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221002 {
//1422

/**
4 9
4
4
4
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int answer = 0;
        String[] arr = new String[k];
        StringBuilder sb = new StringBuilder();
        int max = 0;

        for(int i=0; i<k; i++){
            arr[i] = br.readLine();
            max = Math.max(max,Integer.parseInt(arr[i]));
        }

        Arrays.sort(arr,(o1, o2) -> (o2+o1).compareTo(o1+02));

        for(int i=0; i<n; i++){
            sb.append(arr[i]);
            if(n>k && Integer.parseInt(arr[i]) == max){
                int temp = n-k;
                for(int j=0; j<temp; j++){
                    sb.append(max);
                    n--;
                }
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
