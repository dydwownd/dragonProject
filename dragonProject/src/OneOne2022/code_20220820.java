package OneOne2022;
import java.io.*;

public class code_20220820 {
//1343
/**
XXXXXX
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        str = str.replaceAll("XXXX","AAAA");
        str = str.replaceAll("XX","BB");

        if(str.indexOf("X") > -1){
            bw.write("-1");
        }else{
            bw.write(str);
        }

        bw.close();
        br.close();
    }
}
