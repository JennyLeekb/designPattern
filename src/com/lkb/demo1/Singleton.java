package com.lkb.demo1;

/**
 * 懒汉式 -- 线程不安全
 * 优点：实现简单，lazy初始化
 * 缺点：多线程情况下不安全
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
 * 懒汉式 -- 线程安全 
 * 优点：实现简单，lazy初始化 线程安全
 * 缺点：synchonrized 效率低
 * @author LKB
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {  //加锁
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
