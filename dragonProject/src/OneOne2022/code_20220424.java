package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220424 {

/**
000011
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int zeroCnt = 0;
        int oneCnt = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0') zeroCnt++;
            else oneCnt++;
        }

        for(int i=0; i<zeroCnt/2; i++){
            sb.append("0");
        }

        for(int i=0; i<oneCnt/2; i++){
            sb.append("1");
        }

        System.out.println(sb.toString());

    }
}
