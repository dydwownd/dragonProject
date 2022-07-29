package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class code_20220729 {
//1339
/**
2
GCF
ACDEB
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        long answer = 0;

        for(int i=0; i<n; i++){
            String str = br.readLine();
            int len = str.length();

            for(int j=0; j<len; j++){
                int temp = Math.abs((int)('A'- str.charAt(j)));
                int val = 1;
                for(int k=0; k<len-1-j; k++) val *= 10;
                arr[temp] += val;
            }
        }

        Arrays.sort(arr);

        for(int i=25; i>16; i--){
            answer += (arr[i]*(10-1-(25-i)));
        }

        System.out.println(answer);

    }
}
