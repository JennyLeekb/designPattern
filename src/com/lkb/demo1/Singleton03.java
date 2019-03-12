package com.lkb.demo1;


/**
 * 登记式/静态内部类
 * 优点：懒加载 线程安全 实现难度低
 * 缺点：只适用于静态域的情况
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
