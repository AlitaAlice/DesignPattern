package com.alita.designpattern.factoryInstance.impl;

import com.alita.designpattern.factoryInstance.Human;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 15:10 2020/8/18
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("中文");

    }
}
