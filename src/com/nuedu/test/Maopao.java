package com.nuedu.test;

public class Maopao {
	public static void main(String[] args) {
	//ð������
		int[] b = new int[]{1,20,62,17,36,10};
		//���Ƶ��������
		for(int i=0;i<b.length-1;i++){
			//�����Ƚ�
			for(int j=0;j<b.length-1-i;j++) {
				if(b[j]>b[j+1]){
					//����һ���м����
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
