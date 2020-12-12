#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

typedef struct stu 
{
	int a;
	int b;
} S;

typedef struct
{
	char a;	// 1byte
	int b;		// 4byte
} S2;

typedef struct {
	char a;		// 1byte
	short b;		// 2byte
	int c;			// 4byte
	double d;	// 8byte
} S4;

typedef struct {
	char a;		// 1byte
	double d;	// 8byte
	short b;		// 2byte
	int c;			// 4byte
} S5;

typedef struct
{
	char a[4];	// 4byte
	double b;	// 8byte
} S6;

typedef struct
{
	char a;		// 1byte
	double b;	// 8byte
	char c;		// 1byte
} S7;

int main(int argc, char** argv)
{
	printf("sizeof(S) = %d\n", sizeof(S));		// 8byte
	printf("sizeof(S2) = %d\n", sizeof(S2));	// 8byte
	printf("sizeof(S4) = %d\n", sizeof(S4));	// 16byte
	printf("sizeof(S5) = %d\n", sizeof(S5));  // 24byte
	printf("sizeof(S6) = %d\n", sizeof(S6));	// 16byte
	printf("sizeof(S7) = %d\n", sizeof(S7));	// 24byte

	printf("\n");
	S5 arr[10];
	printf("sizeof(arr) = %d\n", sizeof(arr));


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()