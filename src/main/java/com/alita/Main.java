package com.alita;

import java.util.Scanner;

public class Main {
    public static final String REG_NUMBER = ".*\\d+.*";
    //小写字母
    public static final String REG_UPPERCASE = ".*[A-Z]+.*";
    //大写字母
    public static final String REG_LOWERCASE = ".*[a-z]+.*";
    //特殊符号
    public static final String REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    public static int checkPasswordRule(String password){
        //密码为空或者长度小于8位则返回false
        int i = 0;
//        if (password == null || password.length() <120 ) return false;

        if(password.length()>=8&&password.length() <120) i++;
        else return 1;

        if (password.matches(REG_NUMBER)) i++;
        if (password.matches(REG_LOWERCASE))i++;
        if (password.matches(REG_UPPERCASE)) i++;
        if (password.matches(REG_SYMBOL)) i++;

        if (i  < 3 )  return 2;

        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] chars=str.split(" ");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(checkPasswordRule(chars[i]));
        }
    }

}


    //数字
