package OneOnestart;

public class code_20211223 {

	public static void main(String[] args) {
		int[][] key  = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		System.out.println(solution(key,lock));
	}
	
	static int[][] map;
	static int[][] Key;
	static int plus;
	
	public static boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        
        Key = key;
        int M = key.length;
        int N = lock.length;
        plus = M-1;
        map = new int[N+plus+plus][N+plus+plus];
        
        for(int i=0; i<N; i++) {
        	for(int j=0; j<N; j++) {
        		map[i+plus][j+plus] = lock[i][j];
        	}
        }
        
        for(int i=0; i<N+plus; i++) {
        	for(int j=0; j<N+plus; j++) {
        		for(int k=0; k<4; k++) {
        			lotate();
        			if(isLockOn(i,j)) return true;
        		}
        	}
        }
        
        return answer;
    }

	private static boolean isLockOn(int row, int col) {
		
		boolean check = true;
		
		for(int i=0; i<Key.length; i++) {
			for(int j=0; j<Key.length; j++) {
				map[i+row][j+col] += Key[i][j];
			}
		}
		
		for(int i=plus; i<map.length-plus; i++) {
			for(int j=plus; j<map.length-plus; j++) {
				if(map[i][j] != 1) check = false;
			}
		}
		
		for(int i=0; i<Key.length; i++) {
			for(int j=0; j<Key.length; j++) {
				map[i+row][j+col] -= Key[i][j];
			}
		}
		
		return check;
	}

	private static void lotate() {
		int[][] lotateKey = new int[Key.length][Key.length];
		
		for(int i=0; i<Key.length; i++) {
			for(int j=0; j<Key.length; j++) {
				lotateKey[i][j] = Key[Key.length-1-j][i];
			}
		}
		
		Key = lotateKey;
	}
	
}
