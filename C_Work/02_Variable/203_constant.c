#include <stdio.h>

/*
	��� (Constant)
	 �ѹ� ���� �������� �����Ҽ� ���� ������
	 (������ �ݴ�)

	 ���1 : const Ű���� ���
	 ���2 : #define ���
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

	# : ��ó����(preprocessor)
*/