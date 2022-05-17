package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220517 {

/**
3
7
2
10
0
20
29
31
0
42
41
40
37
20
0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int maxMoney = 5000000;

        for(int testCase=0; testCase<T; testCase++){
            List<Integer> list = new ArrayList<>();
            int answer = 0;

            while(true){
                int tempNumber = Integer.parseInt(br.readLine());
                if(tempNumber == 0) break;
                else list.add(tempNumber);
            }

            Collections.sort(list,Collections.reverseOrder());

            for(int i=0; i<list.size(); i++){
                answer += (2*Math.pow(list.get(i),i+1));
                if(answer > maxMoney) break;
            }

            if(answer > maxMoney) System.out.println("Too expensive");
            else System.out.println(answer);

        }
    }
}
