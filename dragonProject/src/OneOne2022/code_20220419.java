package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class code_20220419 {

/**
7 3 3
3 3 9 7 2 6 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i=a; i<=a+(n*d); i+=d){
            q.offer(i);
        }

        for (int i=0; i<n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp == q.peek()){
                answer++;
                q.poll();
            }
        }

        System.out.println(answer);
    }
}
