#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/** 
	포인터와 배열
	 배열의 이름은 포인터다!  포인터 '상수'다!
	 포인터 연산이 적용된다.
	 배열첨자 연산자 []  ← 결국 포인터 연산이다
	 arr[n] ↔ *(arr + n)   ★★★
**/

int main(int argc, char** argv)
{
	int arr[3] = { 10, 20, 30 };

	// 배열 이름은 곧 '주소'다. 포인터다! 포인터처럼 동작한다.
	// arr 타입은? int * 타입
	printf("arr = %p\n", arr);
	printf("*arr = %d\n", *arr);

	// 포인터 연산 ( +, - ) 작동한다
	printf("arr + 1 = %p, *(arr + 1) = %d, arr[1] = %d \n", arr + 1, *(arr + 1), arr[1]);
	printf("arr + 2 = %p, *(arr + 2) = %d, arr[2] = %d \n", arr + 2, *(arr + 2), arr[2]);

	// 주의! 
	// * 참조연산자 우선순위가 일반적인 산술연산자보다 높다.
	printf("*(arr + 1) = %d,  *arr + 1 = %d\n", *(arr + 1), *arr + 1);


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()