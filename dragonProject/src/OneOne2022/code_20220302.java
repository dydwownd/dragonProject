package OneOne2022;
import java.util.*;
import java.io.*;

/**
5 76
5 4
36 25 1 36 36
4 4
30 24 25 20
6 4
36 36 36 36 36 36
2 4
3 7
5 4
27 15 26 8 14
*/

public class code_20220302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int requestCnt = Integer.parseInt(st.nextToken());
            int possibleCnt = Integer.parseInt(st.nextToken());
            int[] requestCheck = new int[requestCnt];

            st = new StringTokenizer(br.readLine()," ");

            for(int j=0; j<requestCnt; j++){
                requestCheck[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(requestCheck);

            if(requestCnt > possibleCnt){
                if(requestCheck[requestCnt-possibleCnt] == 36) score[i] = -1;
                else score[i] = requestCheck[requestCnt-possibleCnt]+1;
            }else if(requestCnt == possibleCnt){
                score[i] = requestCheck[0]+1;
            }else{
                score[i] = 1;
            }
        }

        Arrays.sort(score);

        for(int i=0; i<N; i++){
            if(score[i] != -1 && score[i] <= M){
                M -= score[i];
                answer++;
            }
        }

        System.out.println(answer);

    }
}
