package OneOne2022;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class code_20221029 {
//1863

/**
10
1 1
2 2
5 1
6 3
8 1
11 0
15 2
17 3
20 2
22 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int answer = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = y;
        }

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<=n; i++){
            while (!stack.isEmpty() && stack.peek() > arr[i]){
                answer++;
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() == arr[i]) continue;

            stack.push(arr[i]);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
