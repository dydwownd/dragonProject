package OneOne2022;
import java.io.*;

public class code_20221012 {
//19940

/**
3
5
12
27
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase=0; testCase<t; testCase++){
            //+60,+10,-10,+1,-1
            int[] calc = new int[5];
            int n = Integer.parseInt(br.readLine());

            calc[0] += n/60;
            n %= 60;

            if(n <= 35){
                if(n%10 > 5){
                    calc[1] += ((n/10)+1);
                    calc[4] += 10 - n%10;
                }else{
                    calc[1] += n/10;
                    calc[3] += n%10;
                }
            }else{
                calc[0]++;

                if(n%10 >= 5){
                    calc[2] += (6-((n/10)+1));
                    calc[4] += (10 - (n%10));
                }else{
                    calc[2] += (6 - (n/10));
                    calc[3] += n%10;
                }
            }

            for(int i=0; i<5; i++){
                sb.append(calc[i]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
