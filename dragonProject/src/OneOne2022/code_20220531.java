package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220531 {

/**
6
TTFTFFTFTF
TTTTFFTTTT

4
TTFTFF
TTTTTT
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String strMe = br.readLine();
        String strYou = br.readLine();
        int len = strMe.length();
        int diff = 0;
        int same = 0;
        int answer = 0;

        for(int i=0; i<len; i++) if(strMe.charAt(i) == strYou.charAt(i)) same++; else diff++;

        if(same > n){
            answer += n+diff;
        }else if(same == 0){
            answer += diff-n;
        }else{
            answer += same;
            diff -= n-same;
            answer += diff;
        }


        System.out.print(answer);
    }
}
