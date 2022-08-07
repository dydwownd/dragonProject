package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220806 {
//1543
/**
ababababa
aba

**replaceAll good idea

*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String target = br.readLine();
        String str = br.readLine();
        int answer = 0;
        int len = str.length();

        for(int i=0; i<=target.length()-str.length(); i++){
            boolean checked = true;

            for(int j=0; j<str.length(); j++){
                if(target.charAt(i+j) != str.charAt(j)){
                    checked = false;
                    break;
                }
            }

            if(checked){
                answer++;
                i += len-1;
            }

        }

        System.out.println(answer);
    }
}
