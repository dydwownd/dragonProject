package OneOne2022;
import java.util.*;

public class code_20220117 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        Arrays.stream(solution(id_list,report,k)).forEach(System.out::println);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,Integer> map = new HashMap<String,Integer>();
        Map<String,Integer> ban = new HashMap<String,Integer>();
        Set<String> reportSet = new HashSet<String>();

        for(int i=0; i< id_list.length; i++){
            map.put(id_list[i],i);
        }

        for(int i=0; i<report.length; i++){
            reportSet.add(report[i]);
        }

        for(String str : reportSet){
            String[] spt = str.split(" ");
            ban.put(spt[1], ban.getOrDefault(spt[1],0)+1);
        }

        for(String str : reportSet){
            String[] spt = str.split(" ");
            if(ban.get(spt[1]) > 1) answer[map.get(spt[0])]++;
        }

        return answer;
    }

}
