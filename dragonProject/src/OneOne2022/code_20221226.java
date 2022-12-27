package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221226 {
//19582

/**
4
10000 1000
2000 5000
3000 4000
5000 10000
*/
    static class CALC {
        long sum;
        boolean flag;

        public CALC(long sum, boolean flag) {
            super();
            this.sum = sum;
            this.flag = flag;
        }
    }

    static int n;
    static CALC plus;
    static CALC minus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int bonus = Integer.parseInt(st.nextToken());

        plus = new CALC(bonus, true);
        minus = new CALC(0, true);

        for(int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());
            min = Integer.parseInt(st.nextToken());
            bonus = Integer.parseInt(st.nextToken());

            if(minus.sum <= min && minus.flag){
                minus.sum += bonus;
            }else{
                minus.flag = false;
            }

            if (plus.flag){
                if (minus.flag){
                    minus.sum = Math.min(plus.sum, minus.sum);
                }
                minus.flag = true;
            }
            if(plus.sum <= min && plus.flag){
                plus.sum += bonus;
            }else{
                plus.flag = false;
            }

        }

        bw.write(plus.flag || minus.flag?"Kkeo-eok":"Zzz" + "\n");
        bw.close();
        br.close();
    }
}
