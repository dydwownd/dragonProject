package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220718 {
//1931
/**
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int answer = 0;
        int min = -1;

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> {if(o1[1]==o2[1]) return o1[0]-o2[0]; else return o1[1]-o2[1];});

        for(int i=0; i<n; i++){
            if(arr[i][0] >= min){
                min = arr[i][1];
                answer++;
            }
        }

        System.out.println(answer);
    }
}
