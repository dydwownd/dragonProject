package OneOne2022;
import java.util.Scanner;

public class code_20220202 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String N = sc.nextLine();
        String T = sc.nextLine();

        sb.append(N);

        if(T.equals(sb.toString())){
            System.out.println(1);
        }else{
            while(true){

                if(T.equals(sb.append("A").toString())){
                    System.out.println(1);
                    break;
                }

                if(T.equals(sb.reverse().append("B").toString())){
                    System.out.println(1);
                    break;
                }

                if(sb.length() > T.length()){
                    System.out.println(0);
                    break;
                }
            }


        }

    }

}
