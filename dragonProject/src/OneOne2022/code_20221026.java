package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221026 {
//16288

/**
3 2
3 2 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] checked = new int[k];
        boolean answer = true;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            boolean visit = true;
            for(int j=0; j<k; j++){
                if(checked[j] == 0 || arr[i] > checked[j]){
                    checked[j] = arr[i];
                    visit = false;
                    break;
                }
            }
            if(visit){
                answer = false;
                break;
            }
        }

        bw.write(answer?"YES":"NO" + "\n");
        bw.close();
        br.close();
    }
}
