package 반복제어문2.형성평가05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int cntOdd = 0;
		int cntEven = 0;
		
		for (int i = 0; i < 10; i++) {
			input[i] = sc.nextInt();
			
			if((input[i] % 2) == 0) {
				cntEven++;
			} else {
				cntOdd++;
			}
		}
		
		System.out.println("even : " + cntEven);
		System.out.println("odd : " + cntOdd);
	}

}