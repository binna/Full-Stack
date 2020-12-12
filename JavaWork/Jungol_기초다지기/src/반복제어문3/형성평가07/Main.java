package 반복제어문3.형성평가07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		char character = 'A';
		int cnt = 0;
		
		for (int i = 0; i < input; i++) {
			for (int j = 0 + i; j < input; j++) {
				System.out.print(character + " ");
				character++;
			}
			for (int j = input; j < input + i; j++) {
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
		
	}

}