package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220917 {
//11034

/**
2 3 5
3 5 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str == null) break;
            StringTokenizer st = new StringTokenizer(str," ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            int result = Math.max(arr[1]-arr[0]-1, arr[2]-arr[1]-1);
            sb.append(result);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
