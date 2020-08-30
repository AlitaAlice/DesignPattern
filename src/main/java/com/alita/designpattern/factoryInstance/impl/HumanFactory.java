package com.alita.designpattern.factoryInstance.impl;

import com.alita.designpattern.factoryInstance.AbstarctHumanFactory;
import com.alita.designpattern.factoryInstance.Human;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 15:14 2020/8/18
 */
public class HumanFactory extends AbstarctHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
