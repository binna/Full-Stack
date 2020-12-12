#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**

**/

int main(int argc, char** argv)
{
	// scanf() 동시에 여러 데이터 입력 가능
	int a, b, c;
	printf("정수 3개 입력하세요 : ");
	scanf("%d %d %d", &a, &b, &c);
	printf("입력값 A = %d, b = %d, c = %d\n", a, b, c);

	printf("또 정수 3개 입력하세요 : ");
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	printf("입력값 A = %d, b = %d, c = %d\n", a, b, c);

	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()