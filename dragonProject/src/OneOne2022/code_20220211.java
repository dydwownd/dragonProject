package OneOne2022;
import java.util.*;

public class code_20220211 {

/**
7 2
-37 2 -6 -39 -29 11 -28
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int answer = 0;
        boolean visited = false;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            max = Math.abs(num) > Math.abs(max) ? num : max;
            list.add(num);
        }

        if(max > 0){
            Collections.sort(list,Collections.reverseOrder());
        }else{
            Collections.sort(list);
        }

        while(list.size()>0){
            if(list.size() >= m){
                if(!visited){
                    answer += Math.abs(list.get(0));
                    visited = true;
                } else answer += Math.abs(list.get(0))*2;
                for(int i=0; i<m; i++) list.remove(0);
            }else{
                if(!visited){
                    answer += Math.abs(list.get(0));
                    visited = true;
                } else answer += Math.abs(list.get(0))*2;
                break;
            }
        }

        System.out.println(answer);
    }

}
