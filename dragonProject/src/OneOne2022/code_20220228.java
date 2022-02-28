package OneOne2022;
import java.util.*;
import java.io.*;
public class code_20220228 {

/**
3
3
M K U
5
A S D F G
7
B A C A B A C
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] answer = new String[T];

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            LinkedList<Character> q = new LinkedList<>();
            String str = br.readLine().replaceAll(" ","");

            for(int j=0; j<N; j++){
                if(q.isEmpty()) q.offer(str.charAt(j));
                else if(q.peek() >= str.charAt(j)) q.addFirst(str.charAt(j));
                else q.addLast(str.charAt(j));
            }
            while(!q.isEmpty()){
                sb.append(q.poll());
            }

            answer[i] = sb.toString();
        }

        Arrays.stream(answer).forEach(System.out::println);
    }

}
