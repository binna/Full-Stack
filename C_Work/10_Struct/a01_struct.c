#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

// ����ü
struct point
{
	int x;		// �������
	int y;		// �������
};

// persion ����ü
struct person 
{
	char name[20];	// �̸�
	int age;				// ����
	double weight;	// ������
};

int main(int argc, char** argv)
{
	struct point p1;

	// ���������(.) ����Ͽ� ����ü ��� ���
	p1.x = 100;
	p1.y = 200;

	printf("p1.x = %d\n", p1.x);
	printf("p1.y = %d\n", p1.y);


	struct person p2;
	p2.age = 32;
	p2.weight = 54.7;
	strcpy(p2.name, "ȫ�浿");

	printf("�̸� : %s, ���� : %d, ������ : %.1f\n", p2.name, p2.age, p2.weight);

	// ����ü ����� ���ÿ� �ʱ�ȭ
	struct person p3 = { "���̾��", 48, 87.663 };
	printf("�̸� : %s, ���� : %d, ������ : %.1f\n", p3.name, p3.age, p3.weight);

	// ����ü ����� 0 ���� �ʱ�ȭ
	struct person p4 = { 0 };
	printf("�̸� : %s, ���� : %d, ������ : %.1f\n", p4.name, p4.age, p4.weight);


	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()