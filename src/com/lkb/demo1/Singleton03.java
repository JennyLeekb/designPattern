package com.lkb.demo1;


/**
 * �Ǽ�ʽ/��̬�ڲ���
 * �ŵ㣺������ �̰߳�ȫ ʵ���Ѷȵ�
 * ȱ�㣺ֻ�����ھ�̬������
 * @author LKB
 *
 */
public class Singleton03 {
	
	private static class SingletonHolder{
		private static final Singleton03 INSTANCE = new Singleton03();
	}
	
	private Singleton03(){
		
	}
	
	public static final Singleton03 GetInstance(){
		return SingletonHolder.INSTANCE;
	}

}
