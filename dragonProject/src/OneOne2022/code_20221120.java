package OneOne2022;
import java.io.*;

public class code_20221120 {
//21314

/**
MKKMMK
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder bigSb = new StringBuilder();
        StringBuilder smallSb = new StringBuilder();
        int idx = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'M') {
                idx = i;
                while(idx < str.length() && str.charAt(idx)=='M'){
                    idx++;
                }
                if(idx==str.length()){
                    for( ; i<idx; i++){
                        bigSb.append(1);
                    }
                }
                else{
                    bigSb.append(5);
                    for( ; i<idx; i++){
                        bigSb.append(0);
                    }
                }
                i=idx;

            } else {
                bigSb.append(5);
            }
        }
        bigSb.append("\n");

        idx = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'M') {
                idx = i;
                while (idx < str.length() && str.charAt(idx) == 'M') {
                    idx++;
                }
                smallSb.append(1);
                for( ; i+1<idx; i++){
                    smallSb.append(0);
                }
                i = idx - 1;
            } else {
                smallSb.append(5);
            }
        }

        bw.write(bigSb.toString()+smallSb.toString());
        bw.close();
        br.close();
    }
}
