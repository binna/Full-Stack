#include<stdio.h>
#pragma warning(disable:4996)

int main()
{
	int kor, eng, math;
	printf("�������� �Է� : ");
	scanf("%d", &kor);		// ���� �� �� �Է� -> kor  ������ ����
									// ������ �տ� & ���̱�!
	printf("���������� �Է��ϼ��� : ");
	scanf("%d", &eng);
	printf("���������� �Է��ϼ��� : ");
	scanf("%d", &math);

	printf("�Է��Ͻ� ������ %d, %d, %d �Դϴ�\n", kor, eng, math);

	getchar();
	getchar();
}