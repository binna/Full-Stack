package 배열2.형성평가07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arNumber1 = new int[2][3];
		int[][] arNumber2 = new int[2][3];
		int[][] arMul = new int[2][3];
		
		System.out.println("first array");
		for (int i = 0; i < arNumber1.length; i++) {
			for (int j = 0; j < arNumber1[i].length; j++) {
				arNumber1[i][j] = sc.nextInt();
			}
		}

		System.out.println("second array");
		for (int i = 0; i < arNumber2.length; i++) {
			for (int j = 0; j < arNumber2[i].length; j++) {
				arNumber2[i][j] = sc.nextInt();
			}
		}
		
		// 곱하기
		for (int i = 0; i < arMul.length; i++) {
			for (int j = 0; j < arMul[i].length; j++) {
				arMul[i][j] = arNumber1[i][j] * arNumber2[i][j];
			}
		}
		
		// 출력하기
		for (int i = 0; i < arMul.length; i++) {
			for (int j = 0; j < arMul[i].length; j++) {
				System.out.print(arMul[i][j] + " ");
			}
			System.out.println();
		}
		
	} // end main()

} // end class