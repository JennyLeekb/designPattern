package com.lkb.demo1;

/**
 * ����ʽ -- �̲߳���ȫ
 * �ŵ㣺ʵ�ּ򵥣�lazy��ʼ��
 * ȱ�㣺���߳�����²���ȫ
 * @author LKB
 *
 */
//public class Singleton {
//	
//	private static Singleton instance ;
//	
//	private Singleton(){
//	}
//	
//	public static Singleton getInstance(){
//		if(instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
//
//}

/**
 * ����ʽ -- �̰߳�ȫ 
 * �ŵ㣺ʵ�ּ򵥣�lazy��ʼ�� �̰߳�ȫ
 * ȱ�㣺synchonrized Ч�ʵ�
 * @author LKB
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {  //����
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
