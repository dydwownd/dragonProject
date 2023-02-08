package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221229 {
//26070

/**
10 30 20
6 100 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int answer = 0;

        if(a<=x){
            answer += a;
            x -= a;
            a = 0;
        }else{
            answer += x;
            a -= x;
            x = 0;
        }

        if(b<=y){
            answer += b;
            y -= b;
            b = 0;
        }else{
            answer += y;
            b -= y;
            y = 0;
        }

        if(c<=z){
            answer += c;
            z -= c;
            c = 0;
        }else{
            answer += z;
            c -= z;
            z = 0;
        }

        if(a>0 && z>2){
            if(z/3 >= a){
                answer += a;
                z -= (a*3);
                a = 0;
            }else{
                answer += z/3;
                a -= z/3;
                z = z%3;
            }
        }

        if(b>0 && x>2){
            if(x/3 >= b){
                answer += b;
                x -= (b*3);
                b = 0;
            }else{
                answer += x/3;
                b -= x/3;
                x = x%3;
            }
        }

        if(c>0 && y>2){
            if(y/3 >= c){
                answer += c;
                y -= (c*3);
                c = 0;
            }else{
                answer += y/3;
                c -= y/3;
                y = y%3;
            }
        }

        if(a>0 && y>8){
            if(y/9 >= a){
                answer += a;
            }else{
                answer += y/9;
            }
        }

        if(b>0 && z>8){
            if(z/9 >= b){
                answer += b;
            }else{
                answer += z/9;
            }
        }

        if(c>0 && x>8){
            if(x/9 >= c){
                answer += c;
            }else{
                answer += x/9;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
