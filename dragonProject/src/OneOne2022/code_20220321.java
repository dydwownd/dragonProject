package OneOne2022;
import java.util.Scanner;

public class code_20220321 {

/**
8
pPAppPAp
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        String target = "pPAp";
        int idx = 0;
        int answer = 0;

        while(n>idx){
            if(str.indexOf(target,idx) != -1){
                idx = str.indexOf(target,idx)+4;
                answer++;
            }else{
                break;
            }
        }

        System.out.println(answer);

    }

}
