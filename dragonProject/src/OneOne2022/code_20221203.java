package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221203 {
//20413

/**
3
30 60 90 150
BSG
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //B,S,G,P,D
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        char[] word = br.readLine().toCharArray();
        int[] arr = new int[5];
        int answer = 0;
        int pre = 0;

        for(int i=1; i<5; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<word.length; i++){

            if(word[i] == 'B'){
                answer += (arr[1]-pre)-1;
                pre = (arr[1]-pre)-1;
            }else if(word[i] == 'S'){
                answer += (arr[2]-pre)-1;
                pre = (arr[2]-pre)-1;
            }else if(word[i] == 'G'){
                answer += (arr[3]-pre)-1;
                pre = (arr[3]-pre)-1;
            }else if(word[i] == 'P'){
                answer += (arr[4]-pre)-1;
                pre = (arr[4]-pre)-1;
            }else if(word[i] == 'D'){
                answer += arr[4];
                pre = arr[4];
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
