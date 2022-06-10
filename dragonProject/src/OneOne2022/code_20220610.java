package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220610 {

/**
7 60 120
4 3
3 4
1 6
4 3
3 4
1 6
4 3
3 4
1 6
6 6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());//8
        int A = Integer.parseInt(st.nextToken());//66
        int B = Integer.parseInt(st.nextToken());//130

        int n = 8-N;
        int a = (66-A)%3==0 ? (66-A)/3 : ((66-A)/3)+1;//2
        int b = (130-B-(a*3))%3==0 ? (130-B-(a*3))/3 : ((130-B-(a*3))/3)+1;//2

        int[][] arr = new int[10][2];
        boolean checked = false;

        for(int i=0; i<10; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(n>0){
                int diff = 6-x;
                diff = diff>=y?diff:y;
                n--;

                a -= x;
                if(a < 0){
                    b += a;
                    a=0;
                }
                b -= diff;
            }
            if(a<=0 && b<=0){
                checked = true;
            }
        }

        if(checked) System.out.println("Nice");
        else System.out.println("Nae ga wae");
    }
}
