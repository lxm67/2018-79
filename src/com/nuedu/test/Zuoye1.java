package com.nuedu.test;

public class Zuoye1 {
	public static void main(String[] args) {
		//计算从1开始的连续n个自然数之和，当其和值刚好超过100时结束，求这个n值
		int num=0;
		int n=0;
		for(int i=1 ;i<100;i++ ) {
			num+=i;
			if(num>=100) {
				n=i;
				break;
				
			}
			
		}
		System.out.println(num);
		System.out.println(n);
		//闰年 
		//创建对象，b的类型是Teststudent12
		Teststudent12 b=new Teststudent12();
		//调用一个setSname（）方法
		b.setSname("345");
		System.out.println(b.getSname());
		Teststudent12 c=new Teststudent12();
		c.setSage(12);
		System.out.println(c.getSage());
		Teststudent12 d=new Teststudent12("sjh",1,3,3,4);
		
		d.print();
		System.out.println(d);
		/*Teststudent12 a =new Teststudent12("qqe",12,11,45,3);*/
		
	}
	
        
        
        
        
        
        
        
        
        
        
        
}
