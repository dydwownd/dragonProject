package OneOne2022;
import java.util.Scanner;

public class code_20220223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int answer = Integer.MAX_VALUE;

        for(int i=L; i<=R; i++){
            answer = Math.min(answer,solve(i));
        }

        System.out.println(answer);

    }

    private static int solve(int i) {
        String str = String.valueOf(i);
        int cnt = 0;
        if(str.contains("8")){
            for(char c : str.toCharArray()){
                if(c == '8') cnt++;
            }
        }
        return cnt;
    }

}
