package com.lec.java.array11;
/* for와 enhanced for의 차이점
	 enhanced for문에서는 배열의 원소를 꺼내서
	 변수에 복사(저장)해서 사용하는 것입니다.
	 즉, 배열의 원소를 직접 변경하는 것은 불가능하다.
 */
public class Array11Main {

	public static void main(String[] args) {
		System.out.println("for와 enhanced for의 차이점");
		
		int[] arr1 = {10, 20, 30, 40, 50};
		
		// 증가 전 값 화면 출력하기
		System.out.println("증가 전");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
		
		System.out.println("\n\n증가 후");
		// 배열의 원소를 +1씩 증가
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] += 1;	// arr1[i]++, arr1[i] = arr1[i] + 1
		}
		// 증가된 값 출력하기
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\n\nEnhanced for 증가후");
		int [] arr2 = {10, 20, 30, 40, 50};
		
		// enhanced for문에서는 사본을 이용하는 것이기 때문에
		// 값이 증가가 안된다
		// 즉, 배열의 원소를 직접 변경하는 것은 불가능하다.
		for(int num : arr2) {
			num += 1;
		}
		
		// 값이 증가가 되지 않았음을 확인하기 위해 출력
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array11Main