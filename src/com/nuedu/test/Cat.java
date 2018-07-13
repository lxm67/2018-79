package com.nuedu.test;
//1.创建一个猫类 具有的属性 品种type 年龄 age  颜色 color 
//通过构造方法给和set给属性赋值 
//2 打印输出猫的所有信息

public class Cat {
	private String ctype;
	private int cage;
	private String ccolor;
	//set设置值的方式
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
	//用构造赋值
	public Cat(String ctype,int cage,String ccolor ) {
		this.ctype=ctype;
		this.cage=cage;
		this.ccolor=ccolor;
	}

	public void print() {
		System.out.println(this.ctype+this.cage+this.ccolor);
	}
	
	
	
	
	
	
}
