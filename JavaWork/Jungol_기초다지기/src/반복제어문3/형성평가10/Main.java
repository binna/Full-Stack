package 반복제어문3.형성평가10;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int num = 1;
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				
				if(num < 10) {
					System.out.print(num + " ");
				} else {
					num = 1;
					System.out.print(num + " ");
				}
				num += 2;
				
			}
			System.out.println();
		}
		
	}

}