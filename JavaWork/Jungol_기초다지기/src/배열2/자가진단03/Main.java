package 배열2.자가진단03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();

		int i = 100;
		System.out.print(i + " " + input + " ");
		
		while (true) {
			int temp = i - input;
			
			if(temp >= 0) {
	 			System.out.print(temp + " ");

	 			i = input;
	 			input = temp;
	 			
			} else { 
				System.out.println(temp);
				break; 
			}
 			
		}
		
	} // end main()

} // end class