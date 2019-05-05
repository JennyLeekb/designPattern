package com.lkb.demo4;

/**
 * @Description 读者---观察者
 * @Author lkb
 * @CreateDate: 2019/5/5
 */
public class Reader implements Observer{

    private String name;

    public Reader(String name){
        setName(name);
    }

    /**
     * 获取通知
     *
     * @return void
     * @author lkb
     * @date 2019/5/5
     */
    @Override
    public void getNotice() {
        System.out.println(name + " 阅读了该信息");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
