#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

// person ����ü
struct person {
	char name[20];  // �̸�
	int age;   // ����
	double weight;   // ������
};

// typedef�� ���ǵ� Ÿ�Ը����� ��� ����
typedef struct person PS;   // PS �� Ÿ�Ը�!

int main(int argc, char** argv)
{
	PS p1;
	PS p2;
	PS p3 = { "�丣", 100, 90.44 };

	// ����ü�� ���� ������
	PS* ptr = &p3;
	printf("�̸� : %s, ���� : %d, ������ : %.1f\n", p3.name, p3.age, p3.weight);
	printf("�̸� : %s, ���� : %d, ������ : %.1f\n", (*ptr).name, (*ptr).age, (*ptr).weight);
	printf("�̸� : %s, ���� : %d, ������ : %.1f\n", ptr->name, ptr->age, ptr->weight);


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()