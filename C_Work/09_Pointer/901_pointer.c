#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

/** 
	포인터1 : 주소연산자
	 메모리
		연속된 1byte 단위들의 공간
		1 byte 단위로 데이터를 저장된다.
		각 byte 데이터는 고유한 주소값을 통해 접근 가능
		 ex) int 값은 4byte 이므로 '연속된' 1byte x 4개 공간에 저장된다.
	 주소
		: Windows 환경에선 주소는 4byte.  (Mac 이나 Linux 에선 8byte);
	 주소연산자 : &
		변수가 저장된 주소값을 리턴하는 연산자
		int 같이 여러byte 에 걸쳐 저장된 데이터의 경우 첫번째 byte 의 주소값
**/

int main(int argc, char** argv)
{
	int n = 100;

	// 주소는 주로 16진수로 표현한다
	printf("n = %d n의 주소는 %d, %x, %p \n", n, &n, &n, &n);

	// 주소값 출력시는 %p
	// 변수명 앞에 & 사용하면 변수의 주소값 반환
	// %p 로 출력시 16진수 8자리로 표현 (32bit, 4byte) ※ 16진수 2자리를 1byte 분량에 해당
	printf("n = %d n의 주소는 %d, %x, %p \n", n, &n, &n, &n);

	// 포인터변수, '주소'를 담는 변수.
	int *p; // int 타입 포인터 변수 p
			   // p 는 int 타입 데이터를 가리키는 주소를 담는다.

	p = &n;   // int변수 n 의 주소를 포인터 p 에 대입
	printf("p = %p, &n = %p\n", p, &n);

	// 참조연산자 *
	// 포인터를 사용해서 담고 있는 주소값을 찾아가 그 주소 안의 '값' 을 꺼내는 것. (참조)
	printf("*p = %d\n", *p);

	int *p2;  // int 타입 포인터 p2 선언
	p2 = p;
	printf("p2 = %p, p = %p, &n = %p\n", p2, p, &n);

	printf("*p2 = %d, *p = %d, n = %d\n", *p2, *p, n);

	// 포인터변수에 직접 숫자값 대입 (위험)
	*p = 500;   // p가 가리키는 주소 (int) 500 을 대입..
	printf("*p2 = %d, *p = %d, n = %d\n", *p2, *p, n);

	//p = 100;  // 위험
	//printf("*p = %d\n", *p);  // 접근하면 안되는 메모리 영역을 포인터로 접근하려 하면 에러.


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()