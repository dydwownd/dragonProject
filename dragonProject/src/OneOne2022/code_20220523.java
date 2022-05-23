package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220523 {

/**
2
10
1 1220 1340
2 1155 1220
2 1220 1340
3 1220 1240
1 1200 1320
2 1250 1310
2 1330 1550
3 1030 1130
3 1130 1300
3 1240 1330
3
1 0500 2200
1 0000 0700
1 2000 2359
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase=1; testCase<=T; testCase++){

            int N = Integer.parseInt(br.readLine());

            int answer = 0;
            int nowDays = 0;
            int minTime = 0;
            int[][] arr = new int[N][3];
            StringTokenizer st;

            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int day = Integer.parseInt(st.nextToken());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                arr[i][0] = day;
                arr[i][1] = A;
                arr[i][2] = B;
            }

            Arrays.sort(arr,(o1, o2) -> {return o1[0]==o2[0]? o1[2]-o2[2] : o1[0]-o2[0];});

            for(int i=0; i<N; i++){
                if(nowDays != arr[i][0]){
                    answer++;
                    nowDays = arr[i][0];
                    minTime = arr[i][2];
                }else{
                    if(minTime <= arr[i][1]){
                        answer++;
                        minTime = arr[i][2];
                    }
                }
            }
            sb.append("Scenario #" + testCase + ":");
            sb.append("\n");
            sb.append(answer);
            sb.append("\n");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
