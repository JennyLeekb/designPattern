package com.lkb.demo1;


/**
 * 饿汉式
 * 优点：线程安全 实现简单
 * 缺点：不是Lazy初始化  类加载时就初始化，浪费内存。
 * @author LKB
 *
 */
public class Singleton01 {
	
	//加static关键字  在类加载的时候就初始化
	private static Singleton01 instance = new Singleton01(); 
	
	private Singleton01(){
		
	}
	
	public static Singleton01 getInstance(){
		return instance;
	}

}
