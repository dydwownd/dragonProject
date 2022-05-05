package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220505 {

/**
5 5
4 2 3 7 6
*/

    public static class Calc implements Comparable<Calc> {
        int idx;
        int number;

        Calc(int i, int n) {
            idx = i;
            number = n;
        }

    @Override
    public int compareTo(Calc o) {
        return o.number-this.number;
    }
}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");

        PriorityQueue<Calc> q = new PriorityQueue<>();
        int[][] arr = new int[n][2];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            q.offer(new Calc(i,Integer.parseInt(st.nextToken())));
        }

        while (t>0){
            Calc temp = q.poll();
            temp.number--;
            t--;
            q.offer(temp);
        }

        for(int i=0; i<n; i++){
            Calc temp = q.poll();
            arr[i][0] = temp.idx;
            arr[i][1] = temp.number;
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

        for(int i=0; i<n; i++){
            sb.append(arr[i][1] + " ");
        }

        System.out.print(sb.toString());
    }
}
