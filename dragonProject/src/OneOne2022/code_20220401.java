package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220401 {

/**
sequence subsequence
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String word = st.nextToken();
        String target = st.nextToken();
        int idx = -1;
        boolean check = true;

        for(int i=0; i<word.length(); i++){
            //System.out.println(word.substring(i,i+1));
            //System.out.println(target.indexOf(word.substring(i,i+1), idx));
            if(target.indexOf(word.substring(i,i+1), idx) >= 0){
                idx = target.indexOf(word.substring(i,i+1),idx);
            }else{
                System.out.println("NO");
                check = false;
                break;
            }
        }

        if(check) System.out.println("YES");
    }

}
