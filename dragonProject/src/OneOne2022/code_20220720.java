package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220720 {
//1541
/**
55-50+40
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] spt = str.split("-");
        long answer = 0;

        for(int i=0; i<spt.length; i++){
            long result = 0;
            StringTokenizer st = new StringTokenizer(spt[i],"+");
            while(st.hasMoreTokens()){
                result += Integer.parseInt(st.nextToken());
            }
            if(i==0){
                answer += result;
            }else {
                answer -= result;
            }
        }

        System.out.println(answer);

    }
}
