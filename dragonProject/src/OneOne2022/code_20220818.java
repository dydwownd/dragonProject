package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220818 {
//2810
/**
9
SLLLLSSLL
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        boolean checked = false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'L'){
                if(!checked) checked = true;
                else n--;
                i++;
            }
        }

        System.out.println(n);
    }
}
