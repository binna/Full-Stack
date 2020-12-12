#include <stdio.h>

/*
	상수 (Constant)
	 한번 값이 정해지면 변경할수 없는 데이터
	 (변수의 반대)

	 방법1 : const 키워드 사용
	 방법2 : #define 사용
*/
#define MAX_VALUE 100

int main()
{
	const int N = 10;
	//N = 20;
	printf("N = %d\n", N);
	printf("MAX_VALUE = %d\n", MAX_VALUE);

	getchar();
}

/*
	#define
	#include
	#ifndef
	#...

	# : 전처리기(preprocessor)
*/