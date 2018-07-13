package com.nuedu.test;

public class Maopao {
	public static void main(String[] args) {
	//冒泡排序
		int[] b = new int[]{1,20,62,17,36,10};
		//控制的排序次数
		for(int i=0;i<b.length-1;i++){
			//两两比较
			for(int j=0;j<b.length-1-i;j++) {
				if(b[j]>b[j+1]){
					//定义一个中间变量
					int tmp=b[j+1];
					b[j+1]=b[j];
					b[j]=tmp;
					
				}
				
			}
			}
		for(int p:b){
			System.out.println(p);
		}
}
	}
