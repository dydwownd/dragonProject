package OneOne2022;
import java.util.Scanner;

public class code_20220126 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = sc.next();
        String str = sc.next();
        int answer = 0;
        int idx = 0;
        int len = str.length();

        while(file.indexOf(str,idx) != -1){
            answer++;
            System.out.println(idx + " " +len);
            idx += len;
        }

        //System.out.println(answer);
    }

}
