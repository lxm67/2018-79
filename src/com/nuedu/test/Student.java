package com.nuedu.test;

public class Student {
	private int sno;
	private String sname;
	private int grade;
	//set����ֵ�ķ�ʽ
	public void setSno(int sno1) {
		//��ʽ����
		if(sno1<0) {
			System.out.println("�������");
		}else {
			System.out.println("��ȷ");
		}
	}
	//get��ȡֵ
	public int getsno() {
		return sno;
	}

}
