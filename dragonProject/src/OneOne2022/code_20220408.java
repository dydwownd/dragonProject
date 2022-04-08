package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220408 {

/**
8
BBRBRBBR
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] cnt = new int[2];//B,R
        char pre = 'Z';

        for(int i=0; i<n; i++){
            if(pre != str.charAt(i)){
                pre = str.charAt(i);
                if(str.charAt(i) == 'B') cnt[0]++;
                else cnt[1]++;
            }
        }

        System.out.println(Math.min(cnt[0],cnt[1])+1);
    }

}
