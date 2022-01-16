package OneOne2022;
import java.util.*;

public class code_20220116 {

    public static void main(String[] args) {

        int distance = 25;
        int[] rocks = {2, 14, 11, 21, 17};
        int n = 2;
        System.out.println(solution(distance,rocks,n));

    }

    public static int solution(int distance, int[] rocks, int n) {
        long answer=0;
        
        Arrays.sort(rocks);
        
        long left = 1;
        long right = distance;
        long mid = 0;
        
        while(left<=right){
            mid = (left+right)/2;
            int remove = 0;
            int before =0;
            
            for(int now : rocks){
                if(now-before < mid){
                    remove++;
                }
                else{
                    before = now;
                }
            }

            if(distance-before<mid){
                remove++;
            }
            
            if(remove<=n){
                left = mid+1;
                if(answer<mid){
                    answer = mid;
                }
            } else{
                right = mid-1;
            }
        }
        return (int)answer;
    }


}
