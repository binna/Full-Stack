#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	배열 초기화
**/

int main(int argc, char** argv)
{
	// 방법1 : 배열 선언과 동시에 초기화
	int arr1[3] = { 10, 20, 30 };

	for (int i = 0; i < 3; i++) 
	{
		printf("arr[%d] = %d\n", i, arr1[i]);
	}

	// 방법2 : 초기화 값의 개수가 배열의 길이보다 작다면??
	// 나머지가 0으로 초기화됨
	int arr2[3] = { 1 };

	printf("\n");
	for (int i = 0; i < 3; i++)
	{
		printf("arr[%d] = %d\n", i, arr2[i]);
	}

	// 방법3 : 배열의 길이를 선언하지 않고 초기값만으로 초기화
	int arr3[] = { 10, 20, 30 };

	printf("\n");
	for (int i = 0; i < 3; i++)
	{
		printf("arr[%d] = %d\n", i, arr3[i]);
	}


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()