package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220709 {
//11883
/**
3
11
16
12
*/

    static int answer;
    static int target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase=0; testCase<T; testCase++){
            target = Integer.parseInt(br.readLine());
            answer = Integer.MAX_VALUE;
            result(target,0,0,0);

            if(answer == Integer.MAX_VALUE) sb.append("-1");
            else sb.append(answer);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void result(int now, int num3, int num5, int num8){
        if(now/8 == 0 && now/5 == 0 && now/3 == 0) return;
        if(now==0){
            StringBuilder temp = new StringBuilder();
            for(int i=0; i<num3; i++) temp.append("3");
            for(int i=0; i<num5; i++) temp.append("5");
            for(int i=0; i<num8; i++) temp.append("8");
            answer = Math.min(answer,Integer.parseInt(temp.toString()));
            return;
        }
        if(now >= 8) result(now%8,num3,num5,now/8);
        if(now >= 5) result(now%5,num3,now/5,num8);
        result(now%3,now/3,num5,num8);
    }
}
