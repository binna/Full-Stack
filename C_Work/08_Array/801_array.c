#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/** 
	�迭(array)
	 ������ Ÿ���� ������(��)�� '�ϳ��� �迭�̸�' ���� ��Ƴ��� ���յ�����
	�迭 ���� ����
	 Ÿ�� �迭������[�迭ũ��];
	 Ÿ�� �迭������[] = { �ʱ�ȭ ��(��)..};
**/

int main(int argc, char** argv)
{
	// 5���� int Ÿ�� �迭
	int korArr[5];

	for (int i = 0; i < 5; i++)
	{
		// �ʱ�ȭ �ȵ� �迭�� �����Ⱚ(garbage value)�� ��� �ִ�.
		printf("����[%d] = %d\n", i, korArr[i]);
	}

	korArr[0] = 100;
	korArr[1] = 90;
	korArr[2] = 88;
	korArr[3] = 44;
	korArr[4] = 76;

	printf("\n");
	for (int i = 0; i < 5; i++)
	{
		printf("����[%d] = %d\n", i, korArr[i]);
	}

	printf("\n");
	// C��� �迭 ���ؽ� ����!
	// �迭 �ε��� ���� ����� ���� �߻� �ȵ�
	// �����Ⱚ ���û�..!!
	for (int i = 0; i <= 5; i++)
	{
		printf("����[%d] = %d\n", i, korArr[i]);
	}

	printf("\n");
	printf("����[%d] = %d\n", -1, korArr[-1]);

	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()