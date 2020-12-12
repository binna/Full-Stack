package 배열2.자가진단04;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] number = {
				{5, 8, 10, 6, 4},
				{11, 20, 1, 13, 2},
				{7, 9, 14, 22 ,3}
		};
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(String.format("%2d   ", number[i][j]));
				
			}
			System.out.println();
			
		}
	}
}