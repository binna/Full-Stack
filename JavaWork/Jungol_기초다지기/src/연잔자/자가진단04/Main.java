package 연잔자.자가진단04;

import java.util.Scanner;

// 두 개의 정수를 입력받아 각각 후치 증가 연산자와 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[2];
		int result = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		result = input[0]++ * --input[1];
		
		System.out.print(input[0] + " " + input[1] + " " + result);
	}
}