package com.nuedu.test;

public class First {
   public static void main(String[] args) {
	System.out.println();
	//求水仙花数
	int a1;
	int b1;
	int c1;
	int t;
	int n;
	
	for(n=100;n<=999;n++) {
		System.out.println(n);
		a1=n/100;
		
		b1=n%100/10;
		c1=n%10;
		t=(int)(Math.pow(a1,3)+Math.pow(b1,3)+Math.pow(c1, 3));
		if(n==t){
			System.out.println("是水仙花数");
		}else {
			/*System.out.println("不是水仙花数");*/
		}
	}
	//运算符的嵌套
	int A=90;
	int B=60;
	if(A>=90) {
		System.out.println(A);
	}
	
	
	
	
}
  
}
