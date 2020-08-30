package com.alita.designpattern.factoryInstance.impl;

import com.alita.designpattern.factoryInstance.Human;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 15:09 2020/8/18
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，可是听不懂");
    }
}
