#include <stdio.h>
/*
	C����� ������ Ÿ��
	 char	: 1byte, �����ϳ�
	 short	: 2byte  ����
	 int	: 4byte   ����
	 long	: 4byte   ���� (�ý��۸��� �ٸ�)
	 float	: 4byte  �Ǽ�
	 double	: 8byte �Ǽ�
*/
int main() 
{
	// C������ Long Ÿ���� ���ͷ� �����ʾƵ� �������� �ʴ´�
	long l1, l2 = 1234567890;
	char ch1 = 'a';

	// char (1byte)
	printf("ch1 = %c\n", ch1);
	printf("ch1 = %d\n", ch1);

	// char ���� : -128 ~ +127
	// unsigned char : 0 ~ 255

	unsigned char ch2 = 255;
	printf("ch2 = %d\n", ch2);

	getchar();

}