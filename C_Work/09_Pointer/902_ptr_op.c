#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/** 
	������ ����
	���:
		������ -> �ּ�
		*������ -> �� �ּҰ� ����Ű�� ��
		������ Ÿ�� -> �� �ּҰ� ����Ű�� ���� Ÿ��
	
		�����ͺ����� +, - ������ �ϴ� ����
		�ᱹ �ּҰ��� ���� �ϴ� ���ε�,
		�ּҰ��� �󸶸�ŭ ���� �ϴ��Ĵ� '������ Ÿ��' �� ���� �ٸ���

		ex) int* ������ �� ��� ����Ű�� ���� Ÿ����  int (4byte) �̱� ������
		      ������ ���� + 1 ������ �� ��� �ּҰ��� 4�����Ѵ�.
**/

int main(int argc, char** argv)
{
	int n = 555;
	int* p = &n;

	printf("n = %d, p = %p, *p = %d \n", n, p, *p);

	// n, p�� ���� +1 ������ �ϸ�?
	printf("n + 1 = %d, p + 1 = %p, *(p + 1) = %d \n", n + 1, p + 1, *(p + 1));	//*(p + 1)�� ������ �� ���

	printf("\n");

	char ch = 'a';
	char* p2 = &ch;

	printf("ch = %d, p2 = %p\n", ch, p2);
	printf("ch + 1 = %d, p2 + 1 = %p\n", ch + 1, p2 + 1);

	printf("\n");

	double d = 3.14;
	double* p3 = &d;
	printf("d = %f, p3 = %p\n", d, p3);
	printf("d + 1 = %f, p3 + 1 = %p\n", d + 1, p3 + 1);
	printf("d + 3 = %f, p3 + 3 = %p\n", d + 3, p3 + 3);


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()