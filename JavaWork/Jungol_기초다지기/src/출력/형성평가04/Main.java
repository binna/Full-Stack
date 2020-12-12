package 출력.형성평가04;

public class Main {

	public static void main(String[] args) {
		
		int kor = 90;
		int mat = 80;
		int eng = 100;
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		
		System.out.println("kor " + kor);
		System.out.println("mat " + mat);
		System.out.println("eng " + eng);
		System.out.println("sum " + sum);
		System.out.println("avg " + (int)avg);
		
	}
}