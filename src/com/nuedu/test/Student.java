package com.nuedu.test;

public class Student {
	private int sno;
	private String sname;
	private int grade;
	//set设置值的方式
	public void setSno(int sno1) {
		//形式参数
		if(sno1<0) {
			System.out.println("输入错误");
		}else {
			System.out.println("正确");
		}
	}
	//get获取值
	public int getsno() {
		return sno;
	}

}
