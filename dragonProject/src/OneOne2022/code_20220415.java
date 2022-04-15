package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220415 {

/**
polymath
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 1;

        for(int i=1; i<str.length(); i++){
            answer++;
            if(str.charAt(i-1) < str.charAt(i)){
                answer--;
            }
        }

        System.out.println(answer);
    }
}
