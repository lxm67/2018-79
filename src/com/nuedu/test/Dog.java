package com.nuedu.test;
//���췽��������
//����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
     //1��������������ֵ���ҳ����нϴ��һ��ֵ
     //2����������doubleֵ�������˻�
     
public class Dog {
	
		public Dog(int num1, int num2) {

			
			//System.out.println("�ϴ�ֵΪ��" + (num1 > num2 ? num1 : num2));

			if (num1 > num2) {
				System.out.println("�ϴ�ֵΪ��" + num1);
			} else {
				System.out.println("�ϴ�ֵΪ��" + num2);
			}
		}

		public Dog(double num1, double num2, double num3) {
			System.out.println("�˻���" + num1 * num2 * num3);
		}
		
		
		
		
		
		
 }

	
	
	
	

