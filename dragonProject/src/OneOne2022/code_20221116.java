package OneOne2022;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221116 {
//9440

/**
5 1 2 7 8 9
6 3 4 2 2 2 2
9 0 1 2 3 4 0 1 2 3
0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if("0".equals(str)) break;
            StringTokenizer st = new StringTokenizer(str," ");
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            int cnt = 0;
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();

            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] == 0) cnt++;
            }

            Arrays.sort(arr);

            if(cnt > 0){
                int temp1 = arr[0];
                int temp2 = arr[1];
                arr[0] = arr[cnt];
                arr[1] = arr[cnt+1];
                arr[cnt] = temp1;
                arr[cnt+1] = temp2;
            }

            for(int i=0; i<n; i++){
                if(i%2==0) num1.append(arr[i]);
                else num2.append(arr[i]);
            }

            sb.append(Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
