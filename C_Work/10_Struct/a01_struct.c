#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

// 구조체
struct point
{
	int x;		// 멤버변수
	int y;		// 멤버변수
};

// persion 구조체
struct person 
{
	char name[20];	// 이름
	int age;				// 나이
	double weight;	// 몸무게
};

int main(int argc, char** argv)
{
	struct point p1;

	// 멤버연산자(.) 사용하여 구조체 멤버 사용
	p1.x = 100;
	p1.y = 200;

	printf("p1.x = %d\n", p1.x);
	printf("p1.y = %d\n", p1.y);


	struct person p2;
	p2.age = 32;
	p2.weight = 54.7;
	strcpy(p2.name, "홍길동");

	printf("이름 : %s, 나이 : %d, 몸무게 : %.1f\n", p2.name, p2.age, p2.weight);

	// 구조체 선언과 동시에 초기화
	struct person p3 = { "아이언맨", 48, 87.663 };
	printf("이름 : %s, 나이 : %d, 몸무게 : %.1f\n", p3.name, p3.age, p3.weight);

	// 구조체 멤버들 0 으로 초기화
	struct person p4 = { 0 };
	printf("이름 : %s, 나이 : %d, 몸무게 : %.1f\n", p4.name, p4.age, p4.weight);


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()