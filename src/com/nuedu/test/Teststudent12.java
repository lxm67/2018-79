package com.nuedu.test;
//����һ��ѧ���� ���԰��� ���� ���� ��� ���� �ɼ�  
	//1.ͨ�����췽������set���������Ը�ֵ
	//2.�����ж���һ�����Եķ��� ���������"����"���Գɼ�Ϊ���ɼ���
	//3.��дһ��toString���� �ڷ��������ѧ����ȫ����Ϣ ����Ϊ��������Ϊ��������ǡ���������
//4.��main�����н��в��� ����ʱ ��������ѧ����Ķ��� �����Ƿŵ�һ�������в��鿴ÿ���������ϸ��Ϣ�Ϳ��Գɼ�
public class Teststudent12 {
	private String sname;
	private int sage;
	private int sheight;
	private int sweight;
	private int sgrade;
	//set��ʽ��ֵ
	public void setSname(String sname) {
		this.sname=sname;
	}
	public String getSname() {
		return this.sname;
	}
	public void setSage(int sage) {
		this.sage=sage;
	}
	public int getSage() {
		return this.sage;
	}
	public void setSheight(int sheight) {
		this.sheight=sheight;
	}
	public void setSweight(int sweight) {
		this.sweight=sweight;
	}
	public void setSgrade(int sgrade ) {
		this.sgrade=sgrade;
	}
	//���츳ֵ ���췽���ķ�������������ȫһ���Ҳ���Ҫ���÷���ֵ���ͣ���û��void�������ı�ʾ����ֵ���͵���������
	public Teststudent12() {}
	public Teststudent12(String sname,int sage,int sheight,int sweight,int sgrade) {
		this.sname=sname;
		this.sage=sage;
		this.sheight=sheight;
		this.sweight=sweight;
		this.sgrade=sgrade;
	}
	public void print() {
		System.out.println(this.sname+this.sage+this.sheight+this.sweight+this.sgrade);
	}
	public String toString() {
		return this.sname+this.sgrade;
	}
	
	
	

}
