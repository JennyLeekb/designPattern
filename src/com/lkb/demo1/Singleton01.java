package com.lkb.demo1;


/**
 * ����ʽ
 * �ŵ㣺�̰߳�ȫ ʵ�ּ�
 * ȱ�㣺����Lazy��ʼ��  �����ʱ�ͳ�ʼ�����˷��ڴ档
 * @author LKB
 *
 */
public class Singleton01 {
	
	//��static�ؼ���  ������ص�ʱ��ͳ�ʼ��
	private static Singleton01 instance = new Singleton01(); 
	
	private Singleton01(){
		
	}
	
	public static Singleton01 getInstance(){
		return instance;
	}

}
