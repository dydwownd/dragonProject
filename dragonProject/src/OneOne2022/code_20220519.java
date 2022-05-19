package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220519 {


/**
4
4 2 8 6
6 5 7 8
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
        StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            int A = Integer.parseInt(stA.nextToken());
            int B = Integer.parseInt(stB.nextToken());
            if(A<B) list.add(A);
        }

        Collections.sort(list,Collections.reverseOrder());

        if(list.size() == 0) System.out.print(0);
        else System.out.print(list.get(0)+list.get(1));
    }
}
