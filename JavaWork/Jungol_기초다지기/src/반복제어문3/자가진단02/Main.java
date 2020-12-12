package 반복제어문3.자가진단02;
/*
 * 자연수 n을 입력받아서 n줄만큼 
 * 다음과 같이 출력하는 프로그램을 작성하시오.
 * 
 * [입력 예]
 * 5
 * 
 * [출력 예]
 * *
 * **
 * ***
 * ****
 * *****
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}
}