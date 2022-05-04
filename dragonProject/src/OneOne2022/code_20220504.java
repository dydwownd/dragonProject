package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220504 {

/**
2
3
15 20 60 75 80 100
4
9 9 12 12 12 15 16 20
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int kind=0; kind<t; kind++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[1000000001];

            StringBuilder sb = new StringBuilder();
            sb.append("Case #" + kind+1 + ": ");

            for(int i=0; i<n*2; i++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp%4 != 0){
                    sb.append(temp + " ");
                    arr[temp*4/3]++;
                }else{
                    if(arr[temp] > 0){
                        arr[temp]--;
                    }else{
                        sb.append(temp + " ");
                        arr[temp*4/3]++;
                    }
                }
            }

            System.out.print(sb.toString());
        }

    }
}
