package OneOne2022;
import java.io.*;

public class code_20220821 {
//12904
/**
B
ABBA
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strS = br.readLine();
        String strT = br.readLine();
        int len = strT.length()-strS.length();
        boolean diff = true;

        for(int i=0; i<len; i++){
            if(diff){//>
                if(strT.charAt(strT.length()-1) == 'A'){

                }else if(strT.charAt(strT.length()-1) == 'B'){
                    diff = false;
                }else{
                    break;
                }
                strT = strT.substring(0,strT.length()-1);
            }else{//<
                if(strT.charAt(0) == 'A'){

                }else if(strT.charAt(0) == 'B'){
                    diff = true;
                }else{
                    break;
                }
                strT = strT.substring(1);
            }
        }

        if(!diff){
            StringBuilder sb = new StringBuilder();
            sb.append(strT);
            strT = sb.reverse().toString();
        }

        bw.write(strS.equals(strT)?"1":"0" + "\n");
        bw.close();
        br.close();
    }
}
