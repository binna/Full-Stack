#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/**
	�񱳿�����, ���������� ����� 1, 0
	���ǽĿ��� 0�̸� -> '����' ����
	               0 �̿��� ���̸� -> '��' ����
**/

int main(int argc, char** argv)
{
	int n = 21;
	if (n % 2 == 0) 
	{
		printf("¦���Դϴ�\n");
	}
	else 
	{
		printf("Ȧ���Դϴ�\n");
	}

	if (100) { printf("���Դϴ�\n"); }

	if (!(4 - (2 * 2))) { printf("���Դϴ�\n"); }
	else { printf("�����Դϴ�\n"); }

	printf("����? %d\n", !(4 - (2 * 2)));
	printf("����2? %d\n", !1024);

	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()