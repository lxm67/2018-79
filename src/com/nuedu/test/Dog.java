package com.nuedu.test;
//构造方法与重载
//创建一个类，为该类定义三个构造函数，分别执行下列操作：
     //1、传递两个整数值并找出其中较大的一个值
     //2、传递三个double值并求出其乘积
     
public class Dog {
	
		public Dog(int num1, int num2) {

			
			//System.out.println("较大值为：" + (num1 > num2 ? num1 : num2));

			if (num1 > num2) {
				System.out.println("较大值为：" + num1);
			} else {
				System.out.println("较大值为：" + num2);
			}
		}

		public Dog(double num1, double num2, double num3) {
			System.out.println("乘积：" + num1 * num2 * num3);
		}
		
		
		
		
		
		
 }

	
	
	
	

