package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220421 {

/**
MKKMMK
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        String[] max = str.split("K");

        for(int i=0; i<max.length; i++){
            if(i == max.length-1 && str.charAt(str.length()-1) == 'M'){
                sb.append("1");
            }else{
                sb.append("5");
                for(int j=0; j<max[i].length(); j++){
                    sb.append("0");
                }
            }
        }

        System.out.println(sb.toString());

        sb = new StringBuilder();
        boolean checked = false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'M'){
                if(checked){
                    sb.append("0");
                }else{
                    sb.append("1");
                }
                if(i+1 < str.length() && str.charAt(i+1) == 'M') checked = true;
                else checked = false;
            }else{
                sb.append("5");
            }
        }

        System.out.println(sb.toString());

    }
}
