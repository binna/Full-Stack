#include<stdio.h>

int main()
{
	//String str = "Hello";

	// ���ڿ� ����
	// �ִ� 20���� ���ڸ� ���� �� �ִ� char �迭 <-- ���ڿ��� ��´�
	char str1[20] = "C language";

	// %s : ���ڿ� ���
	printf("str1 = %s\n", str1);

	char str2[] = "Java language";	// �ڵ����� �ʱ�ȭ, ���ڿ��� ���� ������ŭ�� ũ��� ����
	char* str3 = "Python language";	// ������ ���

	printf("str2 = %s\n", str2);
	printf("str3 = %s\n", str3);

	getchar();

}	