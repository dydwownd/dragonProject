package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220731 {
//16953
/**
100 40021
*/

    static int target;
    static int startNum;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        target = Integer.parseInt(st.nextToken());
        startNum = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;

        dfs(startNum,String.valueOf(startNum),0);

        if(answer == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer+1);
    }

    private static void dfs(int startNum, String valueOf, int cnt) {
        if(startNum < target) return;
        if(startNum == target){
            answer = Math.min(answer,cnt);
            return;
        }
        if(valueOf.charAt(valueOf.length()-1) == '1') dfs(startNum/10,String.valueOf(startNum/10),cnt+1);
        if(startNum%2 == 0) dfs(startNum/2,String.valueOf(startNum/2),cnt+1);
    }
}
