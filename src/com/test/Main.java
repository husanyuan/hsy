package com.test;

public class Main {
    public static void main(String[] args) {
        String a = "http://p.jawofit.cn/";
        String product_pics = "http://p.jawofit.cn/background/1548301634774.png";
        String split = product_pics.split(a)[1];
        System.out.println(split);

    }
}
