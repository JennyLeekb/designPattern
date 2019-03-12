package com.lkb.demo1;


/**
 * ˫����/˫��У����
 * �ŵ㣺������ �̰߳�ȫ ���߳��������Ȼ��Ч
 * ȱ�㣺ʵ�ָ���
 * @author LKB
 *
 */
public class Singleton02 {
	
	private volatile static Singleton02 instance;
	
	private Singleton02(){
		
	}
	
	public static Singleton02 getInstance(){
		if(instance == null){  //������Ա��ⲻ��Ҫ������¼���
			synchronized (Singleton02.class) {
				if(instance == null){  //double check
					instance = new Singleton02();
				}
			}
		}
		return instance;
	}
	
}
