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
	char name[20];		// �ִ� 20���� ���� �� �ִ� ���ڿ�(char[])

	printf("�̸��� �Է��ϼ��� : ");
	scanf("%s", name);	// ���ڿ� �Է¹������� & ������ ������

	printf("�Է��� �̸��� : %s", name);


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()