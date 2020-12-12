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
	char name[20];		// 최대 20문자 담을 수 있는 문자열(char[])

	printf("이름을 입력하세요 : ");
	scanf("%s", name);	// 문자열 입력받을때는 & 붙이지 마세요

	printf("입력한 이름은 : %s", name);


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()