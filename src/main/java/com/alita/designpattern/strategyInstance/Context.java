package com.alita.designpattern.strategyInstance;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 22:06 2020/8/19
 */

/**
 * 封装类
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate()
    {
        this.strategy.operate();
    }
}
