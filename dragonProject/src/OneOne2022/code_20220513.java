package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220513 {

/**
4
3
M
S
S
L
L 3
S 3
L 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int J = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());

        //S:1, M:2, L:3
        int answer = 0;
        int[] arr = new int[J];

        for(int i=0; i<J; i++){
            String size = br.readLine();
            arr[i] = size.equals("S")?1:size.equals("M")?2:3;
        }

        for(int i=0; i<A; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String size = st.nextToken();
            int num = Integer.parseInt(st.nextToken())-1;
            int sizeNum = size.equals("S")?1:size.equals("M")?2:3;

            if(arr[num] != 0 && arr[num]>=sizeNum){
                answer++;
                arr[num] = 0;
            }
        }

        System.out.print(answer);
    }
}
