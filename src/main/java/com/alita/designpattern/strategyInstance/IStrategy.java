package com.alita.designpattern.strategyInstance;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 22:00 2020/8/19
 */

/**
 * 定义一组算法，把每组算法封装起来，并且他们之间可以互换
 */
public interface IStrategy {
    /**
     * 定义可执行算法
     */
    public void operate();
}
