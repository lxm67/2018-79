package com.nuedu.test;
//1.����һ��è�� ���е����� Ʒ��type ���� age  ��ɫ color 
//ͨ�����췽������set�����Ը�ֵ 
//2 ��ӡ���è��������Ϣ

public class Cat {
	private String ctype;
	private int cage;
	private String ccolor;
	//set����ֵ�ķ�ʽ
	public void setCtype(String ctype) {
		this.ctype=ctype;
	}
	public void setCage(int cage) {
		this.cage=cage;
	}
	public void setCcolor(String ccolor) {
		this.ccolor=ccolor;
	}
	public String getCtype() {
		return ctype;
	}
	public int getCage() {
		return cage;
	}
	public String getCcolor() {
		return ccolor;
	}
	//�ù��츳ֵ
	public Cat(String ctype,int cage,String ccolor ) {
		this.ctype=ctype;
		this.cage=cage;
		this.ccolor=ccolor;
	}

	public void print() {
		System.out.println(this.ctype+this.cage+this.ccolor);
	}
	
	
	
	
	
	
}
