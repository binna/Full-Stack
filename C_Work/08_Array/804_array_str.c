#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/** 
	배열과 문자열
	 본질적으로 C언의 문자열은 'char 배열' 이다

	C언어에서 문자열의 끝은
	 '\0' (null 문자) 로 끝나는 'char 배열' 이다
**/

int main(int argc, char** argv)
{
	// 문자열을 선언, 초기화하는 다양한 방법들
	char str1[20] = "nice";
	char str2[] = { 'n', 'i', 'c', 'e', '\0' };
	char str3[] = "nice";
	char* str4 = "nice";

	// %s : '\0' (null 문자)로 끝날때까지 출력한다.
	printf("str1 = %s\n", str1);
	printf("str2 = %s\n", str2);
	printf("str3 = %s\n", str3);
	printf("str4 = %s\n", str4);

	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()