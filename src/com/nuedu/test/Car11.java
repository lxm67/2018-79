package com.nuedu.test;
//��дһ��Java���򣬲���������Ҫ��  1����дһ��Car�࣬���У�   
//���ԣ�Ʒ��(mark)����String����   �۸�price�����ٶȣ�speed������int��
//���ܣ���ʻ��void drive( )��   
//���ܣ����٣�void speedChange(int newSpeed)���������ٶȸ���speed 
 
//3����������E������main�����д���Car�����������aodi��benchi�Ķ��󲢲������������ԡ�  
//4�����Ч�����£� 


public class Car11 {
	public String mark;
    public int price;
    public int speed;
    //set����ֵ�ķ�ʽ
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
	 //���츳ֵ
	 public Car11(String mark,int price,int speed) {
		 this.mark=mark;
		 this.price=price;
		 this.speed=speed;
	 }
	 public void print() {
		 System.out.println(this.mark+this.price+this.speed);
	 }
	 
	 
	 
	 
	 
	 
	 
	}



