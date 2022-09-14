package OneOne2022;
import java.io.*;

public class code_20220914 {
//16120

/**
PPPAPAP
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int len = str.length();
        boolean checked = false;
        int cnt = 0;

        if(str.charAt(len-1) == 'P'){
            checked = true;

            for(int i=0; i<len; i++){
                if(str.charAt(i) == 'P'){
                    cnt++;
                }else{
                    if(cnt<2){
                        checked = false;
                        break;
                    }
                    cnt -= 2;
                }
            }

            if(cnt != 1) checked = false;
        }

        bw.write(checked? "PPAP" : "NP" + "\n");
        bw.close();
        br.close();
    }
}
