package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class code_20220418 {

/**
5
4 3 5 7 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        LinkedList<Integer> list = new LinkedList<>();
        int answer = 0;

        for(int i=0; i<n; i++) list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        while(list.size()>1){
            if(list.peekFirst() > 1){
                list.offerFirst(list.pollFirst()-1);
                list.pollLast();
                if(list.size() == 1) break;

                answer++;
            }else{
                list.pollFirst();
            }
        }

        System.out.println(answer);

    }
}
