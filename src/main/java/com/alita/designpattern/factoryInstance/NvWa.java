package com.alita.designpattern.factoryInstance;

import com.alita.designpattern.factoryInstance.impl.BlackHuman;
import com.alita.designpattern.factoryInstance.impl.HumanFactory;
import com.alita.designpattern.factoryInstance.impl.WhiteHuman;
import com.alita.designpattern.factoryInstance.impl.YellowHuman;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 15:21 2020/8/18
 */
public class NvWa {
    public static void main(String[] args) {

        /**
         * 工厂模式
         * 定义创建对象的接口，让子类去调用此接口，完成实例化对象的操作。将实例化对象操作放到子类去完成。
         */

        AbstarctHumanFactory Yinyanglu = new HumanFactory();
        System.out.println("开始造一批白色人种");
        Human whiteHuman = Yinyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("开始造一批黑色人种");
        Human blackHuman = Yinyanglu.createHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.getColor();
        System.out.println("开始造一批黄色人种");
        Human yellowHuman = Yinyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


    }
}
