package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220714 {
//2205
/**
6
1 2 4 5 7 8
4 1
*/

    static int[] arr;
    static int answer;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        calc(0,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);

        System.out.println(answer);
    }

    private static void calc(int idx, int P, int Q, int value) {
        if(idx==n-1){
            answer = Math.max(answer,value);
            return;
        }
    }
}
