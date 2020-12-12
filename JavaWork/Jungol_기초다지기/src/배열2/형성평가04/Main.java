package 배열2.형성평가04;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] number = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		
		int sum = 0;
		
		for(int i = 0; i < number.length; i++) {
			for(int j = 0; j < number[i].length; j++) {
				System.out.printf("%d ", number[i][j]);
				sum += number[i][j];
			}
			System.out.println();
		}
		
		System.out.println(sum);
		
	}

}