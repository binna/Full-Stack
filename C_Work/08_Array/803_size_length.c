#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	배열의 크기(size) : 배열의 용량(byte)
	배열의 길이(length) : 배열 원소의 개수
**/

int main(int argc, char** argv)
{
	// sizeof() 연산자
	// 데이터의 크기를 byte(정수)로 리턴
	printf("%d\n", sizeof(10));	// 리터럴의 크기
	printf("%d\n", sizeof(double));	// 타입명의 크기도 가능!

	int arr[3];
	printf("sizeof(배열) : %d\n", sizeof(arr));	// 배열 이름으로 배열 크기 확인!
	printf("arr[0]의 size : %d\n", sizeof(arr[0]));	// arr[0]의 size


	// 배열의 길이 구하는 공식
	//		sizeof(배열이름) / sizeof(배열원소타입)
	//		sizeof(배열이름) / sizeof(배열의 첫번째 원소)
	printf("arr의 length = %d\n", sizeof(arr) / sizeof(int));
	printf("arr의 length = %d\n", sizeof(arr) / sizeof(arr[0]));


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()