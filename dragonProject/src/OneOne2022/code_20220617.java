package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220617 {

/**
AAABBB
BBBAAA
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strA = br.readLine();
        String strB = br.readLine();
        int[] cntA = new int[26];
        int[] cntB = new int[26];
        int answer = 0;
        boolean checked = false;

        for(int i=0; i<strA.length(); i++){
            if(strA.charAt(i) != strB.charAt(i)) answer++;
            cntA[strA.charAt(i)-'A']++;
            cntB[strB.charAt(i)-'A']++;
        }

        for(int i=0; i<26; i++){
            if(cntA[i] != cntB[i]){
                checked = true;
                break;
            }
        }

        if(checked) System.out.println(-1);
        else System.out.println(answer);

    }
}
