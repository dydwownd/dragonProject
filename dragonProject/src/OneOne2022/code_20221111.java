package OneOne2022;
import java.io.*;

public class code_20221111 {
//2885

/**
6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int size = 1;
        int sizeCp = 0;
        int answer = 0;

        while(size < n){
            size *= 2;
        }
        sizeCp = size;

        while(n > 0){
            if(n >= size){
                n -= size;
            }else{
                size /= 2;
                answer++;
            }
        }

        bw.write(sizeCp + " " + answer +"\n");
        bw.close();
        br.close();
    }
}
