package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220510 {

/**
3
30 60 90 150
BSG
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int answer = 0;
        int pre = 0;

        if(str.charAt(0) == 'S'){
            answer = S-1;
        }else if(str.charAt(0) == 'G'){
            answer = G-1;
        }else if(str.charAt(0) == 'P'){
            answer = P-1;
        }else if(str.charAt(0) == 'D'){
            answer = D-1;
        }
        pre = answer;

        for(int i=1; i<str.length(); i++){
            int temp = 0;
            if(str.charAt(i) == 'S'){
                temp = G-1;
            }else if(str.charAt(i) == 'G'){
                temp = P-1;
            }else if(str.charAt(i) == 'P'){
                temp = D-1;
            }else if(str.charAt(i) == 'D'){
                temp = D;
            }

            temp -= pre;
            answer += pre+temp;
            pre = temp;
        }

        System.out.print(answer);

    }
}
