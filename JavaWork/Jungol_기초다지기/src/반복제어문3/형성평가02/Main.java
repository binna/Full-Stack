package 반복제어문3.형성평가02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int i = 0;
		
		while(i <= 100) {
			i++;
			
			if((i % input) == 0) {
				System.out.print(i + " ");
				
				if((i % 10) == 0) {break;}
			} // end if
			
		} // end while
				
	} // end main()

} // end class