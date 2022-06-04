package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class code_20220604 {

/**
2
21 22 23 24 25 26
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n*3];

        for(int i=0; i<n*3; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        System.out.print(arr[n+n-1] - arr[n]);
    }
}
