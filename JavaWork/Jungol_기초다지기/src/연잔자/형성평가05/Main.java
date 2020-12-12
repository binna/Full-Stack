package 연잔자.형성평가05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[4];
		
		// 0, 1  민수 / 2, 3 기영
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		if(input[0] > input[2] && input[1] > input[3]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}