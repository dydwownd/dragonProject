package OneOne2022;
import java.io.*;

public class code_20221004 {
//6550

/**
sequence subsequence
person compression
VERDI vivaVittorioEmanueleReDiItalia
caseDoesMatter CaseDoesMatter
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str == null || "".equals(str)) break;
            String[] spt = str.split(" ");
            int idx = 0;

            for(int i=0; i<spt[1].length(); i++){
                if(idx>=spt[0].length()) break;
                if(spt[1].charAt(i) == spt[0].charAt(idx)) idx++;
            }

            if(spt[0].length() == idx) sb.append("Yes");
            else sb.append("No");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
