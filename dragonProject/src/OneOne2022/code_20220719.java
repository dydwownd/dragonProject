package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class code_20220719 {
//1026
/**
5
1 1 1 6 0
2 7 8 3 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] arrA = new Integer[n];
        Integer[] arrB = new Integer[n];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arrA[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arrB[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        for(int i=0; i<n; i++) answer += arrA[i]*arrB[i];

        System.out.println(answer);
    }
}
