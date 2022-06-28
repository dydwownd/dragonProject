package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220628 {
//17842
/**
9 50
A
quick
brown
fox
jumps
over
the
lazy
dog
*/
//'A' < 'B' < 'C' < ... < 'Z' < '_' < 'a' < 'b' < 'c' < ... < 'z'

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int length = 0;
        int val = 0;
        int rd = 0;
        int idx = 0;
        String[] strArr = new String[N];
        String[] strSort = new String[N-1];

        for(int i=0; i<N; i++){
            strArr[i] = br.readLine();
            length += strArr[i].length();
            if(i != N-1){
                strSort[i] = strArr[i];
            }
        }

        val = (M-length)/(N-1);
        rd = (M-length)%(N-1);

        Arrays.sort(strSort,(o1, o2) -> o1.charAt(0) - o2.charAt(0));

        for(int i=0; i<N; i++){
            sb.append(strArr[i]);
            if(i == N-1) break;
            for(int j=0; j<val; j++) sb.append("_");
            if(strArr[i].equals(strSort[idx]) && rd>0){
                sb.append("_");
                idx++;
                rd--;
            }
        }

        System.out.println(sb.toString());
    }
}
