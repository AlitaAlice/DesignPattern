package com.alita.designpattern.singleton;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 10:11 2020/8/11
 */
public class SingleTon {
    public static SingleTon singleTon = new SingleTon();

    public static SingleTon getInstance() {
        return singleTon;
    }
    public  void doSomething() {
        System.out.println("i am singleTon pattern");
    }

}
