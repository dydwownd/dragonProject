package OneOnestart;

import java.util.*;

public class code_20211110 {

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] answer = solution(genres,plays);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static class Music{
		String name;
		int time;
		int idx;
		
		Music(String n, int t, int i){
			name = n;
			time = t;
			idx = i;
		}
	}
	
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer;
        
        Comparator<Music> comp = new Comparator<Music>() {
			public int compare(Music a, Music b) {
				return b.time-a.time;
			}
        };
        
        Map<String, Integer> map = new HashMap<>();
        List<Music> list = new ArrayList<>();
        List<Music> total = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<genres.length; i++) {
        	map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        	list.add(new Music(genres[i],plays[i],i));
        }
        
        for(String key : map.keySet()) {        	
        	total.add(new Music(key,map.get(key),0));
        }
        
        Collections.sort(list,comp);
        Collections.sort(total,comp);
        
        for(int i=0; i<total.size(); i++) {
        	int cnt=0;
        	String name = total.get(i).name;
        	
        	for(int j=0; j<list.size(); j++) {
        		if(name.equals(list.get(j).name)) {
        			cnt++;
        			result.add(list.get(j).idx);
        		}
        		if(cnt == 2) break;
        	}
        }
        
        answer = new int[result.size()];
        
        for(int i=0; i<result.size(); i++) {
        	answer[i] = result.get(i);
        }
        
        return answer;
    }
	
}
