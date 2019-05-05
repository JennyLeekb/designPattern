package com.lkb.demo4;

/**
 * @Description 被观察者接口
 * @Author lkb
 * @CreateDate: 2019/5/5
 */
public interface Observerable {

    /**
     * 注册观察者
     * @author lkb
     * @date 2019/5/5
     * @param
     * @return void
     */
    void register(Observer observer);

    /**
     * 移除观察者
     * @author lkb
     * @date 2019/5/5
     * @param
     * @return void
     */
    void remove(Observer observer);

    /**
     * 通知观察者
     * @author lkb
     * @date 2019/5/5
     * @return void
     */
    void notifyObserver();

}
