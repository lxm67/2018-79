package com.nuedu.test;
//定义一个学生类 属性包括 姓名 年龄 身高 体重 成绩  
	//1.通过构造方法或者set方法给属性赋值
	//2.在类中定义一个考试的方法 方法中输出"姓名"考试成绩为“成绩”
	//3.重写一下toString（） 在方法中输出学生的全部信息 姓名为“”年龄为“”身高是。。。。。
//4.在main方法中进行测试 测试时 创建三个学生类的对象 把他们放到一个数组中并查看每个对象的详细信息和考试成绩
public class Teststudent12 {
	private String sname;
	private int sage;
	private int sheight;
	private int sweight;
	private int sgrade;
	//set方式赋值
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
	//构造赋值 构造方法的方法名与类名完全一致且不需要设置返回值类型，即没有void或其他的表示返回值类型的数据类型
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
