package OneOne2022;
import java.io.*;
import java.util.Stack;

public class code_20221228 {
//2374

/**
3
1
5
10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Long> stack = new Stack();
        long answer = 0;
        long now = 0;

        for(int i=0; i<n; i++){
            long x = Long.parseLong(br.readLine());
            now = Math.max(now, x);

            if(stack.isEmpty())
                stack.push(x);
            else{
                if(stack.peek() < x){
                    answer += x - stack.pop();
                    stack.push(x);
                }
                else if(stack.peek() > x){
                    stack.pop();
                    stack.add(x);
                }
            }
        }

        while(!stack.isEmpty()){
            long num = stack.pop();
            answer += now - num;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
