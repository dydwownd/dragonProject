package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class code_20220409 {

/**
3 3 2
2000 3000 2500
800 1300 1000
500 1000
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int min = Math.min(b,Math.min(c,d));
        Integer[] main = new Integer[b];
        Integer[] side = new Integer[c];
        Integer[] drink = new Integer[d];
        int original = 0;
        int sale = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<b; i++) main[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<c; i++) side[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<d; i++) drink[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(main, Collections.reverseOrder());
        Arrays.sort(side, Collections.reverseOrder());
        Arrays.sort(drink, Collections.reverseOrder());

        for(int i=0; i<min; i++){
            int temp = main[i] + side[i] + drink[i];
            original += temp;
            sale += temp * 0.9;
        }
        for(int i=min; i<b; i++){
            original += main[i];
            sale += main[i];
        }
        for(int i=min; i<c; i++){
            original += side[i];
            sale += side[i];
        }
        for(int i=min; i<d; i++){
            original += drink[i];
            sale += drink[i];
        }

        System.out.println(original);
        System.out.println(sale);
    }

}
