package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220328 {

/**
3
2 5
1 4
2 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        int answer = 0;
        int time = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new int[]{start,end});
        }

        Collections.sort(list,(o1, o2) -> {return o1[1]==o2[1] ? o1[0]-o2[0] : o1[1]-o2[1];});

        time = list.get(0)[1];

        for(int i=1; i<n; i++){
            if(time < list.get(i)[0]){
                answer += list.get(i)[0]-time;
                time = list.get(i)[1];
            }
        }

        System.out.println(answer);

    }

}
