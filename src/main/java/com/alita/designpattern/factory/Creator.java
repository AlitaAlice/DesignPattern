package com.alita.designpattern.factory;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 15:47 2020/8/18
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> c);

}
