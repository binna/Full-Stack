#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	������ �迭 (n-dimensional array)
	 �迭 ÷��(index)��
	 �ϳ� ����ϸ� --> 1���� �迭
	 �ΰ� ����ϸ� --> 2���� �迭
	 ...
**/

int main(int argc, char** argv)
{
	// 2���� �迭 ����
	int array[4][3] = { 0 };	// 4 x 3

	for (int i = 0; i <4; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			printf("arr[%d][%d] = %d\n", i, j, array[i][j]);
		}

	}

	// ���ڿ� �迭. char[][]
	char str[4][20] = {
		"hello",
		"myworld",
		"c-world",
		"������"
	};

	for (int i = 0; i < 4; i++) {
		printf("str[%d] = %s\n", i, str[i]);
	}


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()