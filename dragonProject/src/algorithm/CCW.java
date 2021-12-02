package algorithm;

/* ��ǥ �������ϱ� 
 * ������ ���⼺ Ȯ���ϱ�
 * �ð���� ����, �ݽð���� ���, ������ ���̸� 0
 * */

public class CCW {

	public static void main(String[] args) {
		int n = 4;
		int[][] point = {{0,0},{0,10},{10,10},{10,0}};
		
		solution(n,point);
	}

	private static void solution(int n, int[][] point) {
		long[] a = new long[n+1];
		long[] b = new long[n+1];
		long sumA = 0;
		long sumB = 0;
		
		for(int i=0; i<n; i++) {
			a[i] = point[i][0];
			b[i] = point[i][1];
		}
		
		a[n] = a[0];
		b[n] = b[0];
		
		for(int i=0; i<n; i++) {
			sumA += a[i] * b[i+1];
			sumB += a[i+1] * b[i];
		}
		
		System.out.println(String.format("%.1f", Math.abs(sumA-sumB)/2.0));
		System.out.println(sumA-sumB);//���� �ݽð����
	}
	
}
