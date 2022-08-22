package OneOne2022;
import java.io.*;

public class code_20220822 {
//15904
/**
Union of Computer Programming Contest club contest
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] ucpc = {'U','C','P','C'};
        int idx = 0;
        int from = -1;
        boolean checked = true;

        while(idx<4 && str.indexOf(ucpc[idx],from) > from){
            from = str.indexOf(ucpc[idx],from);
            idx++;
        }

        if(idx != 4) checked = false;

        bw.write(checked?"I love UCPC":"I hate UCPC" + "\n");
        bw.close();
        br.close();
    }
}
