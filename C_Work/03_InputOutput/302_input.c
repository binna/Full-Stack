#include<stdio.h>
#pragma warning(disable:4996)

int main()
{
	int kor, eng, math;
	printf("국어점수 입력 : ");
	scanf("%d", &kor);		// 정수 한 개 입력 -> kor  변수에 대입
									// 변수명 앞에 & 붙이기!
	printf("영어점수를 입력하세요 : ");
	scanf("%d", &eng);
	printf("수학점수를 입력하세요 : ");
	scanf("%d", &math);

	printf("입력하신 점수는 %d, %d, %d 입니다\n", kor, eng, math);

	getchar();
	getchar();
}