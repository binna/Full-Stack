package 반복제어문2.형성평가02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		if(input[0] < input[1]) {
			for (int i = input[0]; i <= input[1]; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = input[1]; i <= input[0]; i++) {
				System.out.print(i + " ");
			}
		}
	}
}