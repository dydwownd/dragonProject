package OneOne2022;
import java.util.*;

public class code_20220119 {

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        Arrays.stream(solution(fees,records)).forEach(System.out::println);
    }

    public static class Car{
        String carNum;
        Integer fee;
        Car(String c, Integer f){
            carNum = c;
            fee = f;
        }
    }

    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        int last = 23*60+59;
        int minute = 0;
        int times = 0;
        int fee = 0;
        List<Car> list = new ArrayList<>();
        Map<String,Integer> result = new HashMap<>();
        Map<String,Integer> calc = new HashMap<>();

        for(int i=0; i<records.length; i++){
            String[] spt = records[i].split(" ");
            String[] time = spt[0].split(":");
            minute = Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
            if("IN".equals(spt[2])){
                if(!result.containsKey(spt[1])) result.put(spt[1],0);
                calc.put(spt[1],minute);
            }else{
                times = minute-calc.get(spt[1]);
                calc.remove(spt[1]);
                result.put(spt[1],result.get(spt[1])+times);
            }
        }

        for(String key : calc.keySet()){
            times = last-calc.get(key);
            result.put(key,result.get(key)+times);
        }

        for(String key : result.keySet()){
            fee=0;
            times = result.get(key);

            fee += fees[1];

            if(times > fees[0]) {
                times -= fees[0];
                if (times % fees[2] == 0) fee += (times / fees[2]) * fees[3];
                else fee += ((times / fees[2]) * fees[3]) + fees[3];
            }

            list.add(new Car(key,fee));
        }

        Collections.sort(list,(a,b) -> a.carNum.compareTo(b.carNum));

        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).fee;
        }

        return answer;
    }



}
