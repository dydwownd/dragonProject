package OneOne2022;
import java.io.*;

public class code_20221128 {
//20310

/**
000011
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        boolean[] checked = new boolean[arr.length];
        StringBuilder sb = new StringBuilder();
        int zeroCnt = 0;
        int oneCnt = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]=='0') zeroCnt++;
            else oneCnt++;
        }

        zeroCnt /= 2;
        oneCnt /= 2;

        for(int i=0; i<arr.length; i++){
            if(oneCnt==0) break;
            if(arr[i] == '1'){
                checked[i] = true;
                oneCnt--;
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            if(zeroCnt==0) break;
            if(arr[i] == '0'){
                checked[i] = true;
                zeroCnt--;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(!checked[i]) sb.append(arr[i]);
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
