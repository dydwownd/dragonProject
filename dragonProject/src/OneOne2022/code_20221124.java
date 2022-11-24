package OneOne2022;
import java.io.*;
import java.math.BigInteger;
import java.util.Collections;
import java.util.PriorityQueue;

public class code_20221124 {
//2036

/**
5
-1
5
-3
5
1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> oneQ = new PriorityQueue<>();
        PriorityQueue<Long> plusQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> minusQ = new PriorityQueue<>();
        BigInteger answer = new BigInteger("0");

        for(int i=0; i<n; i++){
            long temp = Long.parseLong(br.readLine());
            if(temp==1) oneQ.offer(temp);
            else if(temp>1) plusQ.offer(temp);
            else minusQ.offer(temp);
        }

        while(!plusQ.isEmpty() && plusQ.size()>1){
            answer = answer.add(BigInteger.valueOf(plusQ.poll()*plusQ.poll()));
        }

        if(!plusQ.isEmpty()) answer = answer.add(BigInteger.valueOf(plusQ.poll()));

        while(!minusQ.isEmpty() && minusQ.size()>1){
            answer = answer.add(BigInteger.valueOf(minusQ.poll()*minusQ.poll()));
        }

        if(!minusQ.isEmpty()) answer = answer.add(BigInteger.valueOf(minusQ.poll()));

        answer = answer.add(BigInteger.valueOf(oneQ.size()));

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
