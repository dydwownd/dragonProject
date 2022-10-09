package OneOne2022;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class code_20221009 {
//1132

/**
2
ABC
BCA
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        int[][] list = new int[11][2];
        int[] arr = new int[10];
        long answer = 0;
        int init = 9;

        for(int i=0; i<n; i++){
            result[i] = br.readLine();
            for(int j=0; j<result[i].length(); j++){
                char c = result[i].charAt(j);
                int idx = Math.abs(c-'A');
                int sum = 1;
                for(int k=0; k<result[i].length()-1-j; k++){
                    sum *= 10;
                }
                list[idx][0] = idx;
                list[idx][1] += sum;
            }
        }

        Arrays.sort(list,(o1, o2) -> o2[1]-o1[1]);

        for(int i=0; i<11; i++){
            if(list[i][1] == 0) break;
            arr[list[i][0]] = init;
            init--;
        }

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(char c : result[i].toCharArray()){
                int idx = Math.abs(c-'A');
                sb.append(arr[idx]);
            }
            answer += Long.parseLong(sb.toString());
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
