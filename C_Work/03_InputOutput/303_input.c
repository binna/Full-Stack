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
	// scanf() ���ÿ� ���� ������ �Է� ����
	int a, b, c;
	printf("���� 3�� �Է��ϼ��� : ");
	scanf("%d %d %d", &a, &b, &c);
	printf("�Է°� A = %d, b = %d, c = %d\n", a, b, c);

	printf("�� ���� 3�� �Է��ϼ��� : ");
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	printf("�Է°� A = %d, b = %d, c = %d\n", a, b, c);

	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()