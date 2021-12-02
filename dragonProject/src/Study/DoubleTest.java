package Study;

public class DoubleTest {

	public static void main(String[] args) {
		int c = 5;
		
		for(int i=0; i<c; i++) {
			int n = 9;
			int[] student = {100, 99, 98, 97, 96, 95, 94, 93, 91};
			double sum = 0;
			double cnt = 0;
			for(int j=0; j<n; j++) {
				sum += student[j];
			}
			
			for(int j=0; j<n; j++) {
				if(student[j] > sum/n) cnt++;
			}
			double result = cnt/n*100;
			
			System.out.println(Math.round(result*1000)/1000.0 + "%");
		}
	}
	
}

//5 50 50 70 80 100
//7 100, 95, 90, 80, 70, 60, 50
//3 70, 90, 80
//3 70, 90, 81
//9 100, 99, 98, 97, 96, 95, 94, 93, 91