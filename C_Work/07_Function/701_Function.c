#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable:4996)

#include "myfunction.h"

void myFunc(int k, int v) 
{
	printf("�� ���� %d %d �Դϴ�\n", k, v);
	printf("�� : %d, �� : %d, �� : %d\n", k + v, k - v, k * v);
}

// ���� �̸��� �Լ� ���� �Ұ�! -> (�����ε� ����)
// �ڹٴ� ���������� ������ �Ұ�!!
//void myFunc() 
//{}

// �Լ��� ����
double divByTwo(double);

int main(int argc, char** argv)
{
	myFunc(10, 20);
	myFunc(200, 100);
	myFunc(34, 2);

	printf("div��� %f \n", divByTwo(100));

	printf("addTwo() ��� : %d\n", addTwo(10, 20));
	printf("doubleUp() ��� : %.1f\n", doubleUp(10.123));

	printf("\n�ƹ�Ű�� �Է��ϸ� ���α׷� �����մϴ�\n");
	_getch();
	return 0;
} // end main()


// ������ �Լ� ȣ��(���)�ϱ� ���� �ݵ�� ���� '����'�Ǿ� �ְų�,
// Ȥ�� '����'�Ǿ� �־�� �Ѵ�.
// Why? one pass type�̶� ������ �Ʒ��� �������� �����ϱ� ����!
double divByTwo(double arg)
{
	return arg / 2;
}

// ����δ� header ����(*.h)�� ��Ƴ��� ���� �Ϲ���
// ���ǵ� ������ C ����(*.c)�� ����