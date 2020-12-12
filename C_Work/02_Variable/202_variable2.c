#include <stdio.h>
/*
	C언어의 데이터 타입
	 char	: 1byte, 문자하나
	 short	: 2byte  정수
	 int	: 4byte   정수
	 long	: 4byte   정수 (시스템마다 다름)
	 float	: 4byte  실수
	 double	: 8byte 실수
*/
int main() 
{
	// C언어에서는 Long 타입의 리터럴 하지않아도 에러나지 않는다
	long l1, l2 = 1234567890;
	char ch1 = 'a';

	// char (1byte)
	printf("ch1 = %c\n", ch1);
	printf("ch1 = %d\n", ch1);

	// char 범위 : -128 ~ +127
	// unsigned char : 0 ~ 255

	unsigned char ch2 = 255;
	printf("ch2 = %d\n", ch2);

	getchar();

}