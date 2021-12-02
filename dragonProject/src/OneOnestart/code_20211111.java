package OneOnestart;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*stream °øºÎ*/

public class code_20211111{
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		
//		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//		int[] plays = {500, 600, 150, 800, 2500};
//		int[] answer = solution(genres,plays);
	}
	
	public class Music implements Comparable<Music>{
		
		private int played;
	    private int id;
	    private String genre;
	
	    public Music(String genre, int played, int id) {
	    	this.genre = genre; 
	    	this.played = played;
	    	this.id = id;
	    }

	    @Override
	    public int compareTo(Music other) {
	    	if(this.played == other.played) return this.id - other.id;
	    	return other.played - this.played;
	    }

	    public String getGenre() {
	    	return genre;
	    }
	}

	public int[] solution(String[] genres, int[] plays) {
		return IntStream.range(0, genres.length)
		.mapToObj(i -> new Music(genres[i], plays[i], i))
		.collect(Collectors.groupingBy(Music::getGenre))
		.entrySet().stream()
		.sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
		.flatMap(x->x.getValue().stream().sorted().limit(2))
		.mapToInt(x->x.id).toArray();
	}

	private int sum(List<Music> value) {
		int answer = 0;
		for (Music music : value) {
		  answer+=music.played;
		}
		return answer;
	}
	
}
