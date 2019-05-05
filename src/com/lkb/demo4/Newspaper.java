package com.example.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description 报纸---被观察者
 * @Author lkb
 * @CreateDate: 2019/5/5
 */
public class Newspaper implements Observerable{

    private List<Observer> observers;

    public Newspaper(){
        observers = new LinkedList<>();
    }

    /**
     * 注册观察者
     *
     * @param observer
     * @return void
     * @author lkb
     * @date 2019/5/5
     */
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     * @return void
     * @author lkb
     * @date 2019/5/5
     */
    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     *
     * @return void
     * @author lkb
     * @date 2019/5/5
     */
    @Override
    public void notifyObserver() {
        if(null ==observers || observers.isEmpty()){
            System.out.println("没有读者！");
        }
        //发布消息
        System.out.println("newspaper 发布了消息！");
        for(Observer observer : observers){
            observer.getNotice();
        }

    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
