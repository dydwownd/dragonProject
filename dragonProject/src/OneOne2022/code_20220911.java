package OneOne2022;
import java.io.*;
import java.util.Stack;

public class code_20220911 {
//4889

/**
}{
{}{}{}
{{{}
---
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int idx = 1;

        while(true){
            String str = br.readLine();
            if(str.charAt(0) == '-') break;
            int answer = 0;
            Stack<Character> stack = new Stack<>();

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '{'){
                    stack.push('{');
                }else if(str.charAt(i) == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }else{
                        stack.push('{');
                        answer++;
                    }
                }
            }

            if(stack.size()>0) answer += stack.size()/2;

            sb.append((idx++) + ". " + answer + "\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
