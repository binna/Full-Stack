package 배열2.형성평가08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arNumber = new int[4][2];
		int[] sum = new int[4];	
		int width = 0;	int height = 0; int total = 0;
		
		for (int i = 0; i < arNumber.length; i++) {
			for (int j = 0; j < arNumber[i].length; j++) {
				arNumber[i][j] = sc.nextInt();
				
				// 가로 세로 평균을 위해
				if(j % 2 == 0) {
					height += arNumber[i][j];
				} else {
					width += arNumber[i][j];
				}
				
				// 전체 평균을 위해
				total += arNumber[i][j];
			}
		}
		
		// 각각의 도형의 평균을 위해
		for (int i = 0; i < arNumber.length; i++) {
			for (int j = 0; j < arNumber[i].length; j++) {
				sum[i] += arNumber[i][j];
			}
		}
		
		// 출력
		for (int i = 0; i < sum.length; i++) {
			System.out.print((int)((double)sum[i] / arNumber[i].length) + " ");
		}
		System.out.println();
		System.out.println((int)((double)height / arNumber.length) + " "
				+ (int)((double)width / arNumber.length));
		System.out.println((int)((double)total / (arNumber.length * arNumber[0].length)));
		
	} // end main()
	
} // end class