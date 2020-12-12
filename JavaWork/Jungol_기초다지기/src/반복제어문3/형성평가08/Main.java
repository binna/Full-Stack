package 반복제어문3.형성평가08;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 1;
		
		for (int i = 0; i < input; i++) {
			for (int j = input; j < input + i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < input - i; j++) { 
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
		
	} // end main()

} // end class