#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/** 
	�迭�� ���ڿ�
	 ���������� C���� ���ڿ��� 'char �迭' �̴�

	C���� ���ڿ��� ����
	 '\0' (null ����) �� ������ 'char �迭' �̴�
**/

int main(int argc, char** argv)
{
	// ���ڿ��� ����, �ʱ�ȭ�ϴ� �پ��� �����
	char str1[20] = "nice";
	char str2[] = { 'n', 'i', 'c', 'e', '\0' };
	char str3[] = "nice";
	char* str4 = "nice";

	// %s : '\0' (null ����)�� ���������� ����Ѵ�.
	printf("str1 = %s\n", str1);
	printf("str2 = %s\n", str2);
	printf("str3 = %s\n", str3);
	printf("str4 = %s\n", str4);

	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()