package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220327 {

/**
3 15 35
10 20 10
10 10 30
10 40 10
0 0 0
*/

    public static class Team{
        int cnt;
        int A_Dist;
        int B_Dist;
        int diff;
        Team(int c, int ad, int bd, int df){
            cnt = c;
            A_Dist = ad;
            B_Dist = bd;
            diff = df;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(N == 0 && A == 0 && B == 0) break;

            List<Team> list = new ArrayList<>();
            int answer = 0;

            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine()," ");
                int K = Integer.parseInt(st.nextToken());
                int Da = Integer.parseInt(st.nextToken());
                int Db = Integer.parseInt(st.nextToken());
                list.add(new Team(K,Da,Db,Math.abs(Da-Db)));
            }

            Collections.sort(list,(o1, o2) -> o2.diff-o1.diff);

            for(int i=0; i<N; i++){
                Team team = list.get(i);
                if(team.A_Dist < team.B_Dist){
                    if(team.cnt > A){
                        int diff = team.cnt - A;
                        answer += A * team.A_Dist;
                        A = 0;
                        answer += diff * team.B_Dist;
                        B -= diff;
                    }else{
                        answer += team.cnt* team.A_Dist;
                        A -= team.cnt;
                    }
                }else{
                    if(team.cnt > B){
                        int diff = team.cnt - B;
                        answer += B * team.B_Dist;
                        B = 0;
                        answer += diff * team.A_Dist;
                        A -= diff;
                    }else{
                        answer += team.cnt* team.B_Dist;
                        B -= team.cnt;
                    }
                }
            }

            System.out.println(answer);

        }
    }

}
