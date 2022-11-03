package OneOne2022;
import java.io.*;

public class code_20221103 {
//12927

/**
YNYNYNYNY
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int len = arr.length;
        int answer = 0;
        boolean checked = true;

        for(int i=0; i<len; i++){
            if(arr[i] == 'Y'){
                for(int j=i; j<len; j += (i+1)){
                    if(arr[j] == 'Y') arr[j] = 'N';
                    else arr[j] = 'Y';
                }
                answer++;
            }
        }

        for(int i=0; i<len; i++){
            if(arr[i] == 'Y'){
                checked = false;
                break;
            }
        }

        bw.write(!checked?"-1":answer + "\n");
        bw.close();
        br.close();
    }
}
