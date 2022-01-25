package OneOne2022;
import java.util.*;

public class code_20220125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int pkgCnt = n/6;
        int temp = n%6;

        long answer = Long.MAX_VALUE;

        for(int i=0; i<m; i++){
            int pkg = sc.nextInt();
            int one = sc.nextInt();
            answer = Math.min(result(pkgCnt,temp,pkg,one),answer);
        }

        System.out.println(answer);

    }

    private static long result(int pkgCnt, int temp, int pkg, int one) {
        long result = 0;
        result += (pkgCnt * pkg > pkgCnt * (one*6)) ? pkgCnt * (one*6) : pkgCnt * pkg;
        result += (pkg > temp*one) ? temp*one : pkg;

        return result;
    }


}
