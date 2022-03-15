package OneOne2022;
import java.util.LinkedList;
import java.util.Scanner;

public class code_20220315 {

/**
4
1
3
4
2
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        int answer = 0;

        for(int i=0; i<n; i++){
            list.offer(sc.nextInt());
        }

        boolean check = false;

        do{
            check = false;
            int pre = list.get(0);

            for(int i=1; i<n; i++){
                if(list.get(i) < pre){
                    int temp = list.get(i);
                    list.remove(i);
                    list.push(temp);
                    answer++;
                    check = true;
                    break;
                }else{
                    pre = list.get(i);
                }
            }

        }while(check);

        System.out.println(answer);

    }

}
