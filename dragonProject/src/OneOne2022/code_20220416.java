package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class code_20220416 {

/**
2
WMMMMWWMMMWWMW
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[2];
        Queue<Character> q = new LinkedList<>();
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){

            if(!q.isEmpty()){
                if(q.peek() == 'M' && Math.abs(cnt[0]+1 - cnt[1]) <= n){
                    q.poll();
                    cnt[0]++;
                }else if(q.peek() == 'W' && Math.abs(cnt[1]+1 - cnt[0]) <= n){
                    q.poll();
                    cnt[1]++;
                }
            }

            if(str.charAt(i) == 'M'){
                if(Math.abs(cnt[0]+1 - cnt[1]) <= n){
                    cnt[0]++;
                }else if(q.isEmpty()){
                    q.offer('M');
                }else{
                    break;
                }
            }else{
                if(Math.abs(cnt[1]+1 - cnt[0]) <= n){
                    cnt[1]++;
                }else if(q.isEmpty()){
                    q.offer('W');
                }else{
                    break;
                }
            }
        }

        System.out.println(cnt[0]+cnt[1]);

    }

}
