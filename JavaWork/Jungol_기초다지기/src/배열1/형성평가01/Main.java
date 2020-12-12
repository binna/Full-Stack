package 배열1.형성평가01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = new String[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.next();
		}
		
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i] + " ");
		}
		
	}

}