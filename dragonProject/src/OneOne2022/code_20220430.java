package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220430 {

/**
7
GHHHGHH
HHGGGHH
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String strA = br.readLine();
        String strB = br.readLine();
        int answer = 0;
        char lastChar = 'A';

        for(int i=0; i<n; i++){
            if(strA.charAt(i) != strB.charAt(i)){
                if(strB.charAt(i) != lastChar){
                    answer++;
                    lastChar = strB.charAt(i);
                }
            }
        }

        System.out.print(answer);
    }
}
