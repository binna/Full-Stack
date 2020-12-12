package 연잔자.자가진단07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		
		boolean[] isBoolean = new boolean[2];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		//수가 0 이 아닌 경우 참으로, 0 인 경우 거짓으로 간주
		for (int i = 0; i < input.length; i++) {
			if(input[i] == 0) {
				isBoolean[i] = false;
			} else {
				isBoolean[i] = true;
			}
		} // end for
		
		System.out.println((isBoolean[0] && isBoolean[1]) + " " +(isBoolean[0] || isBoolean[1]));
		
	}

}