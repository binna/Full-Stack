package 반복제어문3.자가진단07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 1;
		char character = 'A';
		
		for (int i = 0; i < input; i++) {
			
			for (int j = input - i; j > 0; j--) {
				System.out.print(cnt + " ");
				cnt++;
			} // end for
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print(character + " ");
				character++;
			} // end for
			System.out.println();
		} // end for
		
	} // end main()

} // end class