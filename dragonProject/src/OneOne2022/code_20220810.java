package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220810 {
//2720
/**
3
124
25
194
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][4];
        int[] money = {25,10,5,1};
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            for(int j=0; j<4; j++){
                arr[i][j] = num/money[j];
                num %= money[j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
