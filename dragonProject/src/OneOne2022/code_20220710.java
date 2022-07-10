package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220710 {
//19950
/**
0 0 0 5 4 7
6
1 1 1 1 1 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int z1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int z2 = Integer.parseInt(st.nextToken());
        double result = 0;
        result = Math.sqrt(Math.pow(Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2)),2) + Math.pow(Math.abs(z1-z2),2));
        int N = Integer.parseInt(br.readLine());
        double sum = 0;
        int max = 0;
        boolean checked = false;
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            max = Math.max(temp,max);
        }

        if(sum >result && max < result) checked=true;

        if(checked) System.out.println("YES");
        else System.out.println("NO");
    }
}