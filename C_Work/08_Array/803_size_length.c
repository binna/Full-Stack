#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	�迭�� ũ��(size) : �迭�� �뷮(byte)
	�迭�� ����(length) : �迭 ������ ����
**/

int main(int argc, char** argv)
{
	// sizeof() ������
	// �������� ũ�⸦ byte(����)�� ����
	printf("%d\n", sizeof(10));	// ���ͷ��� ũ��
	printf("%d\n", sizeof(double));	// Ÿ�Ը��� ũ�⵵ ����!

	int arr[3];
	printf("sizeof(�迭) : %d\n", sizeof(arr));	// �迭 �̸����� �迭 ũ�� Ȯ��!
	printf("arr[0]�� size : %d\n", sizeof(arr[0]));	// arr[0]�� size


	// �迭�� ���� ���ϴ� ����
	//		sizeof(�迭�̸�) / sizeof(�迭����Ÿ��)
	//		sizeof(�迭�̸�) / sizeof(�迭�� ù��° ����)
	printf("arr�� length = %d\n", sizeof(arr) / sizeof(int));
	printf("arr�� length = %d\n", sizeof(arr) / sizeof(arr[0]));


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()