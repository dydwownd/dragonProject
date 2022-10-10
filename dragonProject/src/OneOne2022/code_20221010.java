package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221010 {
//12970

/**
3 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] arr = new char[n];
        boolean checked = false;
        StringBuilder sb = new StringBuilder();

        if(k==0){
            checked = true;
            for(int i=0; i<n; i++){
                arr[i] = 'A';
            }
        }else{
            int val = n;
            int init = 0;

            while(init<n){
                if(init*val < k){
                    init++;
                    val--;
                    continue;
                }

                Arrays.fill(arr,'B');

                for(int i=0; i<init-1; i++){
                    arr[i] = 'A';
                }

                int result = (init-1)*val;
                int idx = k-result;
                arr[(n-1)-idx] = 'A';
                checked = true;
                break;
            }

        }

        if(checked){
            for(int i=0; i<n; i++){
                sb.append(arr[i]);
            }
        }else{
            sb.append(-1);
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
