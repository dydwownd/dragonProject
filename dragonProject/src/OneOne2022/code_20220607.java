package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class code_20220607 {

/**
5 5
6 7 8 9 10
2 3 4 5 6

5 3
927291536 144432154 222251432 846751354 648975123
105423157 28465 1354216
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer[] arrN = new Integer[N];
        Integer[] arrM = new Integer[M];
        long answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) arrN[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arrN, Collections.reverseOrder());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++) arrM[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arrM);

        int Midx = 0;
        for(int i=0; i<N; i++){
            if(arrN[i] - arrM[Midx] > 0){
                answer += (arrN[i] - arrM[Midx]);
                Midx++;
            }
            if(Midx >= M) break;
        }

        System.out.println(answer);
    }
}
