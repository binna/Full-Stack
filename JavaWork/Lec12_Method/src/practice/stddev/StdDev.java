package practice.stddev;

import java.util.Scanner;

public class StdDev {

	public static void main(String[] args) {

		Scanner	sc = new Scanner(System.in);
		
		// 임의정수 5개로 초기화한 정수로
		// 평균, 분산, 표준편차 구하기
		// 직접 입력한 경우
		//int[] num = {175, 177, 179, 181, 183};
		//입력을 받은 경우, 175 177 179 181 183, 81 76 81 55 36
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("평균 : " + String.format("%.1f", calcAvg(num)));
		System.out.println("분산 : " + String.format("%.2f", calcVariance(num)));
		System.out.println("표준편산 : " + calcStdDev(num));
		
	} // end main
	
	/**
	 * 메소드 이름 : calcAvg
	 * 매개변수 : int []
	 * 리턴값 : double
	 * 
	 * 주어진 배열의 '평균값' 리턴
	 */
	public static double calcAvg(int num[]) {
		int sum = 0;
		double avg = 0.0;
		
		//총합 구하기
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		//평균 구하기
		avg = (double)sum / num.length;
		
		//평균값 리턴
		return avg;
		
	}
	
	/**
	 * 메소드 이름 : calcVariance
	 * 매개변수 : int []
	 * 리턴값 : double
	 * 
	 * 주어진 배열의 '분산값' 리턴
	 */
	public static double calcVariance(int num[]) {
		//num의 배열 개수 구함
		//왜? 그만큼 편차, 편차 제곱 저장할 변수가 필요하기 때문에
		int Length = num.length;
		
		//편차값 저장할 변수
		double[] deviation = new double[Length];
		
		//평균제곱 저장할 변수
		double[] multi = new double[Length];
		
		//분산 저장할 변수
		double Variance = 0.0;
		double sum = 0.0;
		
		//편차구하기(변량 - 평균)
		for (int i = 0; i < num.length; i++) {
			deviation[i] = num[i] - calcAvg(num);
		}
		
		//편차제곱구하기(편차*편차)
		for (int i = 0; i < deviation.length; i++) {
			multi[i] = deviation[i] * deviation[i];
		}
			
		//분산 구하기(편차제곱의 평균)
		//1.편차 제곱 총 합
		for (int i = 0; i < multi.length; i++) {
			sum += multi[i];
		}
		
		//2.편차 제곱 평균
		Variance = sum / multi.length;
		
		return Variance;
	}

	/**
	 * 메소드 이름 : calcStdDev
	 * 매개변수 : int []
	 * 리턴값 : double
	 * 
	 * 주어진 배열의 '표준편차' 리턴
	 */
	//분산 루트값
	public static double calcStdDev(int num[]) {
		double StdDev = 0.0;
		
		//Math.sqrt(): 제곱근, 루트 근사값 구하기
		StdDev = Math.sqrt(calcVariance(num));
		
		return StdDev;
	}

} // end class









