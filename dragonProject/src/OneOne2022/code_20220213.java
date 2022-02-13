package OneOne2022;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class code_20220213 {

/**
4
3
2
3
2
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;
        int[] plus32 = new int[n];
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<n; i++){
            plus32[i] = sc.nextInt();
        }

        Arrays.sort(plus32);

        for(int i=n-1; i>=0; i--){
            list.offer(plus32[i]);
        }

        while(!list.isEmpty()){
            if(list.size()>=3){
                answer += list.poll();
                answer += list.poll();
                list.pop();
            }else{
                answer += list.poll();
            }
        }

        System.out.println(answer);

    }


}
