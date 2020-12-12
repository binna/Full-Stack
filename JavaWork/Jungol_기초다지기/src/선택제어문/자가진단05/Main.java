package 선택제어문.자가진단05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 = Double.parseDouble(sc.next());
		double num2 = Double.parseDouble(sc.next());
		
		if(num1 >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		} else if(num1 >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}