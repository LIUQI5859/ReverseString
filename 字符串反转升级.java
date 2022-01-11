package com.itheima;

import java.util.Scanner;

public class 字符串反转升级 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = Reverse(line);
        System.out.println(s);
    }
    public static String Reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;
    }
}
