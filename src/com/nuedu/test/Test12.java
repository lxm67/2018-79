package com.nuedu.test;

import java.util.Scanner;

//��д������һ��forѭ������ 1+3+5+7��+99��ֵ���������������
public class Test12 {
	
	public static void main(String[] args) {
       int sum=0;
		for(int a=1;a<100;a=a+2){
			sum=sum+a;
		}
		System.out.println(sum);
		//���1~100��ǰ5�����Ա�3��������
	int num=0,i=1;
	while(i<=100) {
		if(i%3==0) {
		System.out.println(i);	
			
		}
		if(num==5) {
			break;
			
		}
		i++;
	}
	
	//switch��ϰ
	
	 //������������0-6
	 //0--->���������;1--->�������һ
	 //2--->������ڶ�;3--->���������
	 //4--->���������;5--->���������
	 //6--->���������
	Scanner input=new Scanner(System.in);
	do {
	int  t=input.nextInt();
	switch (t) {
	case 0:System.out.println("������");
		break;
	case 1:System.out.println("����һ");
	break;
	case 2:System.out.println("���ڶ�");
	break;
	case 3:System.out.println("������");
	break;
	case 4:System.out.println("������");
	break;
	case 5:System.out.println("������");
	break;
	default:
		System.out.println("������");
		break;
	}
	}while(true);
	
	
	
	
	
	
	
	 //���췽��������
	 //����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
     //3����main�����в��Թ��캯���ĵ��á�
	
	    
		
	
	
	
	
	//����һ��ѧ���� ���԰��� ���� ���� ��� ���� �ɼ�  
		//1.ͨ�����췽������set���������Ը�ֵ
		//2.�����ж���һ�����Եķ��� ���������"����"���Գɼ�Ϊ���ɼ���
		//3.��дһ��toString���� �ڷ��������ѧ����ȫ����Ϣ ����Ϊ��������Ϊ��������ǡ�����������
		//4.��main�����н��в��� ����ʱ ��������ѧ����Ķ��� �����Ƿŵ�һ��������
		//���鿴ÿ���������ϸ��Ϣ�Ϳ��Գɼ�
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
