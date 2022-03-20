package OneOne2022;
import java.util.Arrays;
import java.util.Scanner;

public class code_20220320 {

/**
3
0 40
15 30
5 10
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] rooms = new int[n][2];
        int min = -1;
        int answer = 0;

        for(int i=0; i<n; i++){
            rooms[i][0] = sc.nextInt();
            rooms[i][1] = sc.nextInt();
        }

        Arrays.sort(rooms,(o1, o2) -> {return o1[1]==o2[1] ? o1[0]-o2[0] : o1[1]-o2[1];});

        for(int i=0; i<n; i++){
            if(rooms[i][0] > min){
                min = rooms[i][1];
                answer++;
            }
        }

        System.out.println(answer);

    }

}
