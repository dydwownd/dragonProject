package algorithm;

//합병교집합?

public class UnionFind {

	public static void main(String[] args) {
		int n = 10;
		int[] parents = new int[n];
		
		for(int i=0; i<n; i++) {
			parents[i] = i;
			System.out.print(parents[i]);
		}
		System.out.println();
		
		unionParent(parents, 0, 1);
		unionParent(parents, 1, 2);
		unionParent(parents, 2, 3);
		unionParent(parents, 4, 5);
		unionParent(parents, 5, 6);
		unionParent(parents, 6, 7);
		unionParent(parents, 8, 9);
		
		for(int i=0; i<n; i++) {
			System.out.print(parents[i]);
		}
		System.out.println();
		
		System.out.println(isSameParents(parents,1,3));
	}
	
	public static int getParents(int[] parents, int x) {
		if(parents[x] == x) {
			return x;
		}
		return getParents(parents, parents[x]);
	}
	
	public static void unionParent(int[] parents, int x, int y) {
		int a = getParents(parents, x);
		int b = getParents(parents, y);
		if(a>b) {
			parents[a] = b;
		}else {
			parents[b] = a;
		}
	}
	
	public static boolean isSameParents(int[] parents, int x, int y) {
		if(parents[x] == parents[y]) {
			return true;
		}
		return false;
	}
	
}
