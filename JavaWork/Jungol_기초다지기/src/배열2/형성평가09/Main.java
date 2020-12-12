package 배열2.형성평가09;

import java.util.Scanner;

// 파스칼의 삼각형

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[][] arNumber = new int[input][input];
		
		for (int i = 0; i < arNumber.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				
				if(i >= j) {
					if(i == 0 || j == 0) {
						// arNumber 0 행과 0열들 1집어 넣기
						arNumber[i][j] = 1;
					} else if (j == i) {
						// 1행 1열, 2행 2열, 3행 3열, ... 에 1넣기
						arNumber[i][j] = 1;
					} else {
						// 그 외의 것들은 바로 위의 것과 위의 왼쪽 꺼를 더하기
						arNumber[i][j] = arNumber[i-1][j-1] + arNumber[i-1][j];
					}
				}
			}
		}
		
		
		// 출력
		for (int i = arNumber.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arNumber[i][j] + " ");
			}
			System.out.println();
		}
		
	} // end main()
	
} // end class