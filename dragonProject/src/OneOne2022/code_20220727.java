package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220727 {
//1946
/**
2
5
3 2
1 4
4 1
2 3
5 5
7
3 6
7 3
4 2
1 4
5 7
2 5
6 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase = 0; testCase<t; testCase++){
            int N = Integer.parseInt(br.readLine());
            int answer = 0;
            int min = 0;
            int[][] arr = new int[N][2];

            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

            answer++;
            min = arr[0][1];

            for(int i=1; i<N; i++){
                if(min > arr[i][1]){
                    answer++;
                    min = arr[i][1];
                }
            }

            sb.append(answer);
            sb.append("\n");

        }

        System.out.println(sb.toString());
    }
}
