package com.nuedu.test;

import java.util.Scanner;

//编写程序，用一个for循环计算 1+3+5+7…+99的值，并输出计算结果。
public class Test12 {
	
	public static void main(String[] args) {
       int sum=0;
		for(int a=1;a<100;a=a+2){
			sum=sum+a;
		}
		System.out.println(sum);
		//输出1~100内前5个可以被3整除的数
	int num=0,i=1;
	while(i<=100) {
		if(i%3==0) {
		System.out.println(i);	
			
		}
		if(num==5) {
			break;
			
		}
		i++;
	}
	
	//switch练习
	
	 //键盘输入数字0-6
	 //0--->输出星期日;1--->输出星期一
	 //2--->输出星期二;3--->输出星期三
	 //4--->输出星期四;5--->输出星期五
	 //6--->输出星期六
	Scanner input=new Scanner(System.in);
	do {
	int  t=input.nextInt();
	switch (t) {
	case 0:System.out.println("星期日");
		break;
	case 1:System.out.println("星期一");
	break;
	case 2:System.out.println("星期二");
	break;
	case 3:System.out.println("星期三");
	break;
	case 4:System.out.println("星期四");
	break;
	case 5:System.out.println("星期五");
	break;
	default:
		System.out.println("星期六");
		break;
	}
	}while(true);
	
	
	
	
	
	
	
	 //构造方法与重载
	 //创建一个类，为该类定义三个构造函数，分别执行下列操作：
     //3、在main方法中测试构造函数的调用。
	
	    
		
	
	
	
	
	//定义一个学生类 属性包括 姓名 年龄 身高 体重 成绩  
		//1.通过构造方法或者set方法给属性赋值
		//2.在类中定义一个考试的方法 方法中输出"姓名"考试成绩为“成绩”
		//3.重写一下toString（） 在方法中输出学生的全部信息 姓名为“”年龄为“”身高是。。。。。。
		//4.在main方法中进行测试 测试时 创建三个学生类的对象 把他们放到一个数组中
		//并查看每个对象的详细信息和考试成绩
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
