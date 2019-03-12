package com.lkb.demo1;


/**
 * 双检锁/双重校验锁
 * 优点：懒加载 线程安全 多线程情况下仍然高效
 * 缺点：实现复杂
 * @author LKB
 *
 */
public class Singleton02 {
	
	private volatile static Singleton02 instance;
	
	private Singleton02(){
		
	}
	
	public static Singleton02 getInstance(){
		if(instance == null){  //这里可以避免不必要的情况下加锁
			synchronized (Singleton02.class) {
				if(instance == null){  //double check
					instance = new Singleton02();
				}
			}
		}
		return instance;
	}
	
}
