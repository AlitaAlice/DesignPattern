package com.alita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

//    public static String replacestr(String target,String source )
//    {
//        char[] chars = target.toCharArray();
//        /**
//         * a b c d
//         */
//
//        int length = chars.length * chars.length;
//        String[] strings = new String[length];
//        for (int i = 0; i <length ; i++) {
//            strings[i] = String.valueOf(chars[0]);
//        }
//
//
//    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
       String Source = scanner.nextLine();
       String  repalce = scanner.nextLine();
        List<String> result = new ArrayList<>();
        getAllList(result, str.toCharArray(), 0);
        String target =Source;
        for(String each : result){
             target = target.replaceAll(each, repalce);
        }
         System.out.println(target);
    }
    public static void getAllList(List<String> result, char[] strs, int begin){
        if(begin == strs.length-1){
            result.add(String.valueOf(strs));
        }
        for(int i = begin; i < strs.length; i++){
            swap(strs, i, begin);
            getAllList(result, strs, begin+1);
            swap(strs, i, begin);
        }
    }

    private static void swap(char[] strs, int index1, int index2) {
        char temp = strs[index1];
        strs[index1] = strs[index2];
        strs[index2] = temp;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = "\u00234\1234";
//        System.out.println(str.length());
//    }

}


    //数字
