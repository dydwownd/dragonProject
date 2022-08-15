package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class code_20220815 {
//2812
/**
4 2
1924
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = k;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        for(int i=0; i<n; i++){
            while (cnt>0 && !stack.isEmpty() && stack.peek() < arr[i]){
                stack.pop();
                cnt--;
            }
            stack.push(arr[i]);
        }

        for(int i=0; i<n-k; i++) sb.append(stack.elementAt(i));

        System.out.println(sb.toString());
    }
}
