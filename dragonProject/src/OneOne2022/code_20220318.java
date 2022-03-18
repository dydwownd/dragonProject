package OneOne2022;
import java.util.*;

public class code_20220318 {

/**
5
3 30 34 5 9
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            String str = sc.next();
            list.add(str);
        }

        Collections.sort(list,(o1, o2) -> (o2+o1).compareTo(o1+o2));

        for(int i=0; i<n; i++){
            sb.append(list.get(i));
        }

        System.out.println(sb.toString());

    }

}
