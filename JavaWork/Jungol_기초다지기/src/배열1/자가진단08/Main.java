package 배열1.자가진단08;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int sumOdd = 0;
		int sumEven = 0;
		double avgOdd = 0.0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			
			if((i % 2) == 0) {
				// 사용자 입장에서는 1부터 숫자가 시작하고
				// 배열의 시작은 0부터 시작함
				// 따라서 0번째 방은 사용자 인식은 1이므로 홀수 합..!!
				sumOdd += input[i];
			} else {
				sumEven += input[i];
			} 
		}
		
		avgOdd = sumOdd / 5.0;
		
		System.out.println("sum : " + sumEven);
		System.out.println("avg : " + String.format("%.1f", avgOdd));
				
	}

}