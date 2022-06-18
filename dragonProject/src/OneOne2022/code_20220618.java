package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class code_20220618 {

/**
2
5 8
7 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] teamA = new Integer[N];
        Integer[] teamB = new Integer[N];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) teamA[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) teamB[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(teamA, Collections.reverseOrder());
        Arrays.sort(teamB, Collections.reverseOrder());

        int idxA = 0;
        int idxB = 0;

        while(idxA<teamA.length && idxB<teamB.length){
            if(teamA[idxA] > teamB[idxB]){
                answer += 2;
                idxA++;
                idxB++;
            }else if(teamA[idxA] == teamB[idxB]){
                if(idxA+1<teamA.length && idxB+1<teamB.length && teamA[idxA+1]> teamB[idxB+1]){
                    answer++;
                    idxA++;
                    idxB++;
                }else{
                    idxB++;
                }
            }else{
                idxB++;
            }
        }

        System.out.println(answer);
    }
}
