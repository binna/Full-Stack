package 선택제어문.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//키
		int height = Integer.parseInt(sc.next());
		//몸무게
		int weight = Integer.parseInt(sc.next());
		int result = weight + 100 - height;
		
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("Obesity");
		}

	}

}