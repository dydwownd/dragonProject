package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220511 {

/**
ACAB
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();

        String answer = str;

        for(int i=0; i<len-1; i++){
            if(str.charAt(i) > str.charAt(i+1)){
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0,i+1)).reverse();
                sb.append(str.substring(i+1,len));
                str = sb.toString();
                if(answer.compareTo(str) > 0){
                    answer = str;
                }
            }
        }

        System.out.print(answer);

    }
}
