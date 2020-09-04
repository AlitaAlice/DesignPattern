package com.alita.bishi;
import java.util.Arrays;

/**
 * 问题：顺时针螺旋输出数组
 * 题目特征：保持一种模式前进，遇到一定条件转换另一种模式前进
 * 思路：用一个二维数组来不同取值来控制前进，设置变动的边界为改变的条件
 */
public class test4 {

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String string=null;
        string=in.nextLine();
        char s=string.charAt(0);
        double count=1,d;
        for (int i = 0; i < string.length(); i++) {
            if (s!=string.charAt(i)) {
                s=string.charAt(i);
                count++;
            }
        }
        d=string.length()/count;
        System.out.println(String.format("%.2f", d));
    }
}

