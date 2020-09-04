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
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("ENGLISH");
    }
}
