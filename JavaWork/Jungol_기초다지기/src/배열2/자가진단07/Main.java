package 배열2.자가진단07;

public class Main {

	public static void main(String[] args) {
		
		int[][] number = new int[5][5];
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if(i == 0) {
					number[i][j] = 1;
				} else if(j == 0) {
					number[i][j] = 1;
				} else {
					number[i][j] = number[i - 1][j] + number[i][j - 1];
				}
			}
		} // end for
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
		
	} // end main
	
} // end class