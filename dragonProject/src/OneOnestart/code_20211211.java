package OneOnestart;

import java.util.*;
import java.util.stream.Collectors;

public class code_20211211 {

	public static void main(String[] args) {
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id = {"fr*d*", "*rodo", "******", "******"};
		int answer = solution(user_id,banned_id);
		System.out.println(answer);
	}
	
	static HashSet<String> result;
	static String[] user;
	static String[] ban;
	static boolean[] visited;
	
	public static int solution(String[] user_id, String[] banned_id) {
		result = new HashSet<>();
		user = user_id;
		ban = banned_id;
		visited = new boolean[user_id.length]; 
		
		dfs(0,"");
		
        return result.size();
    }

	private static void dfs(int cnt, String str) {
		if(cnt == ban.length) {
			String[] spt = str.split(",");
			String temp = Arrays.stream(spt).sorted().collect(Collectors.joining());
			result.add(temp);
			return;
		}
		for(int i=0; i<user.length; i++) {
			if(!visited[i] && checked(i,cnt)) {
				visited[i] = true;
				dfs(cnt+1,str+","+user[i]);
				visited[i] = false;;
			}
		}
		
	}

	private static boolean checked(int i, int cnt) {
		if(user[i].length() != ban[cnt].length()) {
			return false;
		}
		
		for(int j=0; j<ban[cnt].length(); j++) {
			if(ban[cnt].charAt(j) == '*') continue;
			if(ban[cnt].charAt(j) != user[i].charAt(j)) return false;
		}
		
		return true;
	}
	
}
