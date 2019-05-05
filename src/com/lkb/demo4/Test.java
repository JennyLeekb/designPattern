package com.lkb.demo4;

/**
 * @Description 测试
 * @Author lkb
 * @CreateDate: 2019/5/5
 */
public class Test {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        Reader reader1 = new Reader("Alice");
        Reader reader2 = new Reader("Bob");
        Reader reader3 = new Reader("Cici");

        //观察者订阅消息
        newspaper.register(reader1);
        newspaper.register(reader2);
        newspaper.register(reader3);

        //被观察者发布消息
        newspaper.notifyObserver();

        System.out.println();

        //观察者取消订阅
        newspaper.remove(reader2);

        //被观察者发布消息
        newspaper.notifyObserver();
    }
}
