package 반복제어문1.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int input = sc.nextInt();
			
			if((input % 3) == 0) {
				System.out.println(input / 3);
			} else if(input == -1) {
				break;
			}
			
		} // end while
		
	} // end main()
	
} // end class