package 선택제어문.형성평가01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		int result = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		
		if(input[0] > input[1]) {
			result = input[0] - input[1];
		} else {
			result = input[1] - input[0];
		}
		
		System.out.println(result);
	}
}