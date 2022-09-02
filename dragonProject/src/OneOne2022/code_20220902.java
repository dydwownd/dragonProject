package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220902 {
//8980

/**
4 40
6
3 4 20
1 2 10
1 3 20
1 4 30
2 3 10
2 4 20
*/

    public static class Node{
        int start;
        int end;
        int amount;
        Node(int s, int e, int a){
            start = s;
            end = e;
            amount = a;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int nowAmount = 0;
        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> o1.end==o2.end? o1.start-o2.start : o1.end-o2.end);
        PriorityQueue<Node> truck = new PriorityQueue<>((o1, o2) -> o1.end-o2.end);
        long answer = 0;

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            q.offer(new Node(Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())));
        }

        for(int i=0; i<n; i++){
            while(!truck.isEmpty()){
                Node temp = truck.peek();
                if(temp.end > i) break;
                nowAmount -= temp.amount;
                answer += temp.amount;
                truck.poll();
            }

            while(!q.isEmpty()) {
                Node temp = q.peek();
                if(temp.start > i) break;
                if(nowAmount+temp.amount <= c){
                    nowAmount += temp.amount;
                    truck.offer(new Node(0,temp.end,temp.amount));
                }else if(nowAmount < c){
                    int num = c-nowAmount;
                    nowAmount += num;
                    truck.offer(new Node(0,temp.end,num));
                }

                q.poll();
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
