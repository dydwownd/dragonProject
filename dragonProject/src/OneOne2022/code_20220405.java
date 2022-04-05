package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_20220405 {

/**
2
47
9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] val = {25,10,1};

        for(int i=0; i<t; i++){
            String str = br.readLine();
            int len = str.length();
            double num = Double.parseDouble(str);
            int cnt = 0;

            for(int j=len/2; j>=0; j--){
                for(int k=0; k<3; k++){
                    double tar = val[k]*Math.pow(100,j);
                    cnt += num/tar;
                    num = num%tar;
                }
            }

            System.out.println(cnt);

        }

    }

}
