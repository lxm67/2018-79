package com.nuedu.test;
//编写一个Java程序，并满足如下要求：  1）编写一个Car类，具有：   
//属性：品牌(mark)——String类型   价格（price）、速度（speed）——int型
//功能：驾驶（void drive( )）   
//功能：变速（void speedChange(int newSpeed)），把新速度赋给speed 
 
//3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对象并测试其对象的特性。  
//4）输出效果如下： 


public class Car11 {
	public String mark;
    public int price;
    public int speed;
    //set设置值的方式
	public void setMark(String mark){
	    this.mark = mark;
	}
	public  void setPrice(int price){
		this.price=price;
	}
	 public void setSpeed(int speed) {
		this.speed=speed;
	 }
	 public String getMark() {
		 return mark;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public int getSpeed() {
		 return speed;
	 }
	 //构造赋值
	 public Car11(String mark,int price,int speed) {
		 this.mark=mark;
		 this.price=price;
		 this.speed=speed;
	 }
	 public void print() {
		 System.out.println(this.mark+this.price+this.speed);
	 }
	 
	 
	 
	 
	 
	 
	 
	}



