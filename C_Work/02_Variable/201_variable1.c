#include <stdio.h>

int main() 
{
	int a;
	int mike, jane;
	a = 100;
	printf("a = %d\n", a);

	// 초기화되지 않은 지역변수를 사용했기 때문에 에러 발생함
	printf("mike = %d\n", mike);
	printf("jane = %d\n", jane);

	getchar();
}