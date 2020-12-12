package 반복제어문2.형성평가06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		// 두 개의 정수를 입력
		for (int i = 0; i < 2; i++) {
			input[i] = sc.nextInt();
		} 
		
		if(input[0] < input[1]) {
			for (int i = input[0]; i <= input[1]; i++) {
				
				if((i % 3) == 0) {
					sum += i;
					cnt++;
				} else if((i % 5) == 0) {
					sum += i;
					cnt++;
				}
				
			}
		} else {
			for (int i = input[1]; i <= input[0]; i++) {
				
				if((i % 3) == 0) {
					sum += i;
					cnt++;
				} else if((i % 5) == 0) {
					sum += i;
					cnt++;
				}
				
			}
		}
		
		avg = sum / (double)cnt;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + String.format("%.1f", avg));
		
	}

}