package OneOne2022;
import java.io.*;

public class code_20221208 {
//1464

/**
BCDAF
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]);
        for(int i=1; i<arr.length; i++){
            if( arr[i-1] < arr[i] ){
                sb.insert(0,arr[i]);
            }else{
                sb.append(arr[i]);
            }
        }

        bw.write(sb.reverse().toString());
        bw.close();
        br.close();
    }
}
