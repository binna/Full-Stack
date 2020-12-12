package 반복제어문3.형성평가06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 1 + i; j < input; j++) {
				System.out.print("  ");
			}
			int num = 1;
			for (int j = input; j <= input + i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println("");
		}
	}

}