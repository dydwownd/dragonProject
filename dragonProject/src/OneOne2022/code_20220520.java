package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220520 {

/**
3
1
3
4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> set = new HashSet<>();

        for(int i=1; i<N; i++) {
            if(set.size() == 0){
                answer++;
                set.add(arr[i]-1);
            }
            else{
                boolean checked = false;
                for(int num : set){
                    if((arr[i]-1) % num == 0){
                        checked = true;
                        break;
                    }
                }
                if(!checked){
                    answer++;
                    set.add(arr[i]-1);
                }
            }

        }

        System.out.print(answer);
    }
}
