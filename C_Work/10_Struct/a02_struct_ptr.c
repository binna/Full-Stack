#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

// person 구조체
struct person {
	char name[20];  // 이름
	int age;   // 나이
	double weight;   // 몸무게
};

// typedef로 정의된 타입명으로 사용 가능
typedef struct person PS;   // PS 는 타입명!

int main(int argc, char** argv)
{
	PS p1;
	PS p2;
	PS p3 = { "토르", 100, 90.44 };

	// 구조체에 대한 포인터
	PS* ptr = &p3;
	printf("이름 : %s, 나이 : %d, 몸무게 : %.1f\n", p3.name, p3.age, p3.weight);
	printf("이름 : %s, 나이 : %d, 몸무게 : %.1f\n", (*ptr).name, (*ptr).age, (*ptr).weight);
	printf("이름 : %s, 나이 : %d, 몸무게 : %.1f\n", ptr->name, ptr->age, ptr->weight);


	printf("\n아무키나 입력하면 프로그램 종료합니다\n");
	_getch();
	return 0;
} // end main()