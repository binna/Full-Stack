package 배열1.형성평가02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		int sum = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		sum = input[0] + input[2] + input[4];
		
		System.out.println(sum);
		
	}
}