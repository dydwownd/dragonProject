package OneOne2022;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221023 {
//16206

/**
5 8
34 45 56 12 23
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        List<Integer> cakeTen = new ArrayList<>();
        List<Integer> cakeOther = new ArrayList<>();
        int answer = 0;
        int cut = 0;
        int piece = 0;

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp == 10) answer++;
            else if(temp%10 == 0){
                cakeTen.add(temp);
            }else {
                cakeOther.add(temp);
            }
        }

        Collections.sort(cakeTen);

        for(int i : cakeTen){
            if(m==0) break;

            piece = i/10;
            cut = piece-1;

            if(m < cut){
                cut = m;
                piece = cut;
                if(i-(piece*10) == 10) piece++;
            }

            m -= cut;
            answer += piece;
        }

        for(int i : cakeOther){
            if(m==0) break;

            piece = i/10;
            cut = piece;

            if(m < cut){
                cut = m;
                piece = cut;
            }

            m -= cut;
            answer += piece;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
