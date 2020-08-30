package com.alita.designpattern.factory;

import com.alita.designpattern.factory.impl.ConcreteCreator;
import com.alita.designpattern.factory.impl.ConcreteProduct1;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 16:00 2020/8/18
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
    }
}
