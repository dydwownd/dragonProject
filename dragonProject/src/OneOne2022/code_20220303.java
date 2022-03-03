package OneOne2022;
import java.util.*;
import java.io.*;

public class code_20220303 {

/**
2 3 5
3 5 9
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int max = Math.max(b-a,c-b);

                if(max > 1) System.out.println(max-1);
                else System.out.println(0);
            }catch(Exception e){
                break;
            }

        }
    }

}
