package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220429 {

/**
4
3 4
1 1000
2 2
5 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = (int)(Double.parseDouble(st.nextToken())/Double.parseDouble(st.nextToken())*100000);
            arr[i][1] = i+1;
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

        for(int i=0; i<n; i++){
            System.out.print(arr[i][1] + " ");
        }
    }
}
