package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class code_20220314 {

/**
3
1011 1100
100101 110100
00110100 10010111
*/

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String a = sc.next();
            String b = sc.next();
            int aZero = 0;
            int bZero = 0;

            for(int j=0; j<a.length(); j++){
                if(a.charAt(j) != b.charAt(j)){
                    if(a.charAt(j) == '0') aZero++;
                    else bZero++;
                }
            }

            System.out.println(Math.abs(aZero-bZero)+Math.min(aZero, bZero));

        }
    }

}
