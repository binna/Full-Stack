package 배열2.형성평가06;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] number = new int[5][5];
		
		// 1행 1 0 1 0 1 값 대입 필요
		for (int i = 0; i < number[0].length; i++) {
			if(i % 2 == 0) {
				number[0][i] = 1;
			} else {
				number[0][i] = 0;
			}
		}
		
		// 2행부터는 바로 위행의 왼쪽과 오른쪽의 값을 더하여
		for (int i = 1; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if(j == 0) {
					number[i][j] = number[i-1][j+1];
				} else if(j == 4) {
					number[i][j] = number[i-1][j-1];
				} else {
					number[i][j] = number[i-1][j-1] + number[i-1][j+1];
				}
			}
		}
		
		// 값 출력하기
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
		
	} // end main

} // end class