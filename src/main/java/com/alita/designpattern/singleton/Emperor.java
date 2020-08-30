package com.alita.designpattern.singleton;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 10:06 2020/8/11
 */
public class Emperor {
    public static Emperor emperor = new Emperor();


    public Emperor() {

    }

    public static Emperor getInstance() {
        return emperor;
    }

    public void say() {
        System.out.println("i am emperor.");
    }
}
