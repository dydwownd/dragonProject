package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220706 {
//17449
/**
3
4
2 5 4 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nowRank = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        boolean checked = false;

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp<nowRank) nowRank++;
            else if(temp==nowRank){
                if(checked) nowRank++;
                checked = true;
            }else if(temp==nowRank+1 && checked){
                nowRank++;
            }
        }

        if(checked) System.out.println(nowRank + " " + ++nowRank);
        else System.out.println(nowRank + " " + nowRank);
    }
}
