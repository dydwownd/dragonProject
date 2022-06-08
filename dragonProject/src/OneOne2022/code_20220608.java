package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220608 {

/**
3
1 2 3
2 3 4
4 5 6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        int answer = 1;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            sb.append(st.nextToken());
            sb.append(st.nextToken());
            sb.append(st.nextToken());
            list.add(sb.toString());
        }

        String preStr = list.get(0);

        for(int i=1; i<N; i++){
            String nowStr = list.get(i);
            if(nowStr.indexOf(preStr.substring(0,1)) >= 0 || nowStr.indexOf(preStr.substring(1,2)) >= 0 || nowStr.indexOf(preStr.substring(2,3)) >= 0){

            }else{
                answer++;
            }
            preStr = nowStr;
        }

        System.out.println(answer);
    }
}
