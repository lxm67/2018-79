package com.nuedu.test;

public class Zuoye1 {
	public static void main(String[] args) {
		//�����1��ʼ������n����Ȼ��֮�ͣ������ֵ�պó���100ʱ�����������nֵ
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
		//���� 
		//��������b��������Teststudent12
		Teststudent12 b=new Teststudent12();
		//����һ��setSname��������
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
