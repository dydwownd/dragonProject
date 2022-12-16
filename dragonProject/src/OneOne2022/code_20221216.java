package OneOne2022;
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class code_20221216 {
//3213

/**
3
1/2
3/4
3/4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        Deque<Integer> deq1 = new LinkedList<>();
        Deque<Integer> deq2 = new LinkedList<>();
        Deque<Integer> deq3 = new LinkedList<>();
        String str;

        for(int i=0; i<n; i++){
            str = br.readLine();
            if("1/2".equals(str)) deq1.offer(1);
            else if("1/4".equals(str)) deq2.offer(1);
            else deq3.offer(1);
        }

        while(!deq2.isEmpty() && !deq3.isEmpty()){
            deq2.pollFirst();
            deq3.pollFirst();
            answer++;
        }
        while(!deq2.isEmpty() && !deq1.isEmpty()){
            deq2.pollFirst();
            if(deq2.isEmpty()){
                deq1.pollFirst();
                answer++;
                break;
            }
            deq2.pollFirst();
            deq1.pollFirst();
            answer++;
        }
        while(!deq3.isEmpty()){
            deq3.pollFirst();
            answer++;
        }
        while(!deq2.isEmpty()){
            deq2.pollFirst();
            answer++;
        }
        while(!deq1.isEmpty()){
            deq1.pollFirst();
            if(deq1.isEmpty()){
                answer++;
                break;
            }
            deq1.pollFirst();
            answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
