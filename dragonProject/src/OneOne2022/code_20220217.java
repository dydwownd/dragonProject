package OneOne2022;
import java.util.*;

public class code_20220217 {

/**
20 1
HHPHPPHHPPHPPPHPHPHP
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String str = sc.next();
        int answer = 0;

        boolean[] hamberger = new boolean[N];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'H') hamberger[i] = true;
            else list.add(i);
        }

        for(int i : list){
            if(isPossible(i,N,K,hamberger)) answer++;
        }

        System.out.println(answer);

    }

    private static boolean isPossible(int i, int n, int k, boolean[] hamberger) {
        int start = i-k < 0 ? 0 : i-k;
        int end = i+k > n-1 ? n-1 : i+k;

        for(int j=start; j<=end; j++){
            if(hamberger[j]){
                hamberger[j] = false;
                return true;
            }
        }

        return false;
    }

}
