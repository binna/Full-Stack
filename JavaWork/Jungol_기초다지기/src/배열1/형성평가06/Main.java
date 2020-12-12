package 배열1.형성평가06;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] text = {'J', 'U', 'N', 'G', 'O', 'L'};
		//String text = "JUNGOL";
		String input = sc.next();
		int cnt = -1;
		
		for (int i = 0; i < text.length; i++) {
			if(input.indexOf(text[i]) != -1) {
				cnt = i;
				break;
			}
		}
		
		if(cnt == -1) {
			System.out.print("none");
		} else {
			System.out.print(cnt);
		}
		
	} // end main()

} // end class