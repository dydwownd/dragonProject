package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220929 {
//16496

/**
5
3 30 34 5 9

6
45 44 43 42 41 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String[] strArr = new String[n];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) strArr[i] = st.nextToken();

        Arrays.sort(strArr,(o1, o2) -> (o2+o1).compareTo(o1+o2) );

        for(int i=0; i<n; i++) sb.append(strArr[i]);

        if(sb.toString().charAt(0) == '0'){
            sb = new StringBuilder();
            sb.append("0");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
