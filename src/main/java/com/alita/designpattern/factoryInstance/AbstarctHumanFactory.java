package com.alita.designpattern.factoryInstance;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 15:12 2020/8/18
 */
public abstract class AbstarctHumanFactory {
    /**
     * 采用泛型，必须是Class类型，必须是Human的实现类
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);

}
