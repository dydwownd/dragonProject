package OneOne2022;
import java.util.*;

public class code_20220201 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> crane = new ArrayList<>();
        int answer = 0;
        List<Integer> box = new ArrayList<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            crane.add(sc.nextInt());
        }

        int M = sc.nextInt();

        for(int i=0; i<M; i++){
            box.add(sc.nextInt());
        }
        Collections.sort(crane, Collections.reverseOrder());
        Collections.sort(box, Collections.reverseOrder());

        if(crane.get(0) < box.get(0)) System.out.println(-1);
        else{
            while(box.size() != 0){
                int idx = 0;
                int i = 0;

                while(i != crane.size()-1){
                    if(box.size() == 0 || idx == box.size()) break;
                    if(crane.get(i) >= box.get(idx)){
                        box.remove(idx);
                        i++;
                    }else{
                        idx++;
                    }
                }

                answer++;
            }

            System.out.println(answer);
        }


    }

}
