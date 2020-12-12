#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	비교연산자, 논리연산자의 결과는 1, 0
	조건식에서 0이면 -> '거짓' 판정
	               0 이외의 값이면 -> '참' 판정
**/

int main(int argc, char** argv)
{
	int n = 21;
	if (n % 2 == 0) 
	{
		printf("짝수입니다\n");
	}
	else 
	{
		printf("홀수입니다\n");
	}

	if (100) { printf("참입니다\n"); }

	if (!(4 - (2 * 2))) { printf("참입니다\n"); }
	else { printf("거짓입니다\n"); }

	printf("뭐지? %d\n", !(4 - (2 * 2)));
	printf("뭐지2? %d\n", !1024);

	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()