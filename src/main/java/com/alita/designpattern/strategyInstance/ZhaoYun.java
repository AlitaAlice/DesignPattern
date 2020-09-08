package com.alita.designpattern.strategyInstance;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 22:08 2020/8/19
 */
public class ZhaoYun {
    public static void main(String[] args) {


        Context context;
        System.out.println("----刚刚到吴国拆第一个锦囊----");
        /**
         * 封装类Context 定义一组算法，将每个算法都封装起来，并且使他们之间可以互换。
         */

        /**
         * 封装类中new new的话实现Istrategy的子类
         */
        context = new Context(new BackDoor()); //拿到妙计
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("刘乐不思蜀了，拆第2个");
        context = new Context(new GiveGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("拆第3个锦囊");
        context = new Context(new BlockEnemy());
        context.operate();

    }
}
