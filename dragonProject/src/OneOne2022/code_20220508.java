package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220508 {

/**
3
1
6
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] checked = new boolean[2*N];
        int[] me = new int[N];
        int[] you = new int[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            me[i] = Integer.parseInt(br.readLine())-1;
            checked[me[i]] = true;
        }

        Arrays.sort(me);

        int idx = 0;
        for(int i=0; i<2*N; i++){
            if(!checked[i]) you[idx++] = i;
        }

        int meIdx = 0;
        int youIdx = 0;

        while(meIdx<N && youIdx<N){
            if(me[meIdx] > you[youIdx]){
                answer++;
                youIdx++;
            }
            meIdx++;
        }

        System.out.print(answer);
    }
}
