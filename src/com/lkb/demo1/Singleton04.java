package com.lkb.demo1;


/**
 * 枚举实现单例模式
 * 优点：线程安全 实现方式简单  自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 * 缺点：不是懒加载
 * 
 * 并不是使用枚举就不需要保证线程安全，只不过线程安全的保证不需要我们关心而已。
 * 也就是说，其实在“底层”还是做了线程安全方面的保证的。
 * @author LKB
 *
 */
public enum Singleton04 {
	INSTANCE;  
    public void whateverMethod() {  
    }  
}
