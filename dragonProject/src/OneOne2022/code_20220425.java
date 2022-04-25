package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220425 {

/**
5
2 1 3 5 6
1 1 3 2 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] mine = new int[n];
        int[] other = new int[n];
        int minePoint = 0;
        int otherPoint = 0;
        int score = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            mine[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            other[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(mine);
        Arrays.sort(other);

        while(minePoint<n && otherPoint<n){
            if(mine[minePoint]<other[otherPoint]){
                score++;
                minePoint++;
                otherPoint++;
            }else{
                otherPoint++;
            }
        }

        if ((n + 1) / 2 <= score) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
