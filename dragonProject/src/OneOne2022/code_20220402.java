package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class code_20220402 {

/**
6
5 -2 -7 -8 9 1
-9 1 8 -7 5 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int answer = 0;


        for(int i=0; i<n; i++){
            answer += Math.abs(Integer.parseInt(st1.nextToken()));
            answer += Math.abs(Integer.parseInt(st2.nextToken()));
        }

        System.out.println(answer);
    }

}