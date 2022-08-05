package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220805 {
//2864
/**
11 25
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        String first = st.nextToken().replaceAll("6","5");
        String second = st.nextToken().replaceAll("6","5");

        sb.append(Integer.parseInt(first) + Integer.parseInt(second));
        sb.append(" ");

        first = first.replaceAll("5","6");
        second = second.replaceAll("5","6");

        sb.append(Integer.parseInt(first) + Integer.parseInt(second));

        System.out.println(sb.toString());

    }
}
