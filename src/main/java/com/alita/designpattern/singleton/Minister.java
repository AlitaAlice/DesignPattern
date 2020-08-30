package com.alita.designpattern.singleton;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 10:09 2020/8/11
 */
public class Minister {

    public static void main(String[] args) {

        for (int i = 0; i <3 ; i++) {
            SingleTon singleTon = SingleTon.getInstance();
            singleTon.doSomething();

        }
    }

}
