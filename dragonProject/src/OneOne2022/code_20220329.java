package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code_20220329 {

/**
3
5
12
27
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] settings = new int[5];// 0:+60, 1:+10, 2:-10, 3:+1, 4:-1

        for(int i=0; i<T; i++){
            Arrays.fill(settings,0);
            int n = Integer.parseInt(br.readLine());

            if(n >= 60){
                settings[0] = n/60;
                n = n%60;
            }

            //6
            if(n>=36){
                settings[0]++;
                n = 60-n;

                settings[2] = n/10;
                n = n%10;

                settings[4] = n;

            }else{
                settings[1] = n/10;
                n = n%10;

                settings[3] = n;
            }

            System.out.println(settings[0] + " " + settings[1] + " " + settings[2] + " " + settings[3] + " " + settings[4]);

        }

    }

}
