package 반복제어문3.형성평가09;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 1; i <= input * 2; i++) {
			if(i <= input) {
				for (int j = input; j < input + i; j++) {
					System.out.print("# ");
				}
			} else {
				for (int j = i - input; j > 0; j--) {
					System.out.print("  ");
				}
				for (int j = i - input; j < input; j++) {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
	}

}