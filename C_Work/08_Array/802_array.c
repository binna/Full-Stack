#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	�迭 �ʱ�ȭ
**/

int main(int argc, char** argv)
{
	// ���1 : �迭 ����� ���ÿ� �ʱ�ȭ
	int arr1[3] = { 10, 20, 30 };

	for (int i = 0; i < 3; i++) 
	{
		printf("arr[%d] = %d\n", i, arr1[i]);
	}

	// ���2 : �ʱ�ȭ ���� ������ �迭�� ���̺��� �۴ٸ�??
	// �������� 0���� �ʱ�ȭ��
	int arr2[3] = { 1 };

	printf("\n");
	for (int i = 0; i < 3; i++)
	{
		printf("arr[%d] = %d\n", i, arr2[i]);
	}

	// ���3 : �迭�� ���̸� �������� �ʰ� �ʱⰪ������ �ʱ�ȭ
	int arr3[] = { 10, 20, 30 };

	printf("\n");
	for (int i = 0; i < 3; i++)
	{
		printf("arr[%d] = %d\n", i, arr3[i]);
	}


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()