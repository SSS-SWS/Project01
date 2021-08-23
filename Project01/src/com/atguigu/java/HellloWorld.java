package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * try catch 快捷键：：alt+shift+z
 * 查看类的继承结构图：：ctrl+shift+u
 * 查找方法在哪里被调用：：ctrl+shift+h
 * 查看类的结构信息：： ctrl+o
 * 增强for循环：： iter
 * if赋值：： ifn
 * 收起所有的方法：： alt+shift+c
 * 打开所有的方法：： alt+shift+x
 * 反撤销：： ctrl+y
 */

public class HellloWorld {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a = " + a);
        ArrayList<Object> objects = new ArrayList<>();
        if (objects == null) {

        }
        System.out.println("HelloWorld");

    }

    public void test() {

        List list = new ArrayList();
        for (Object term : list) {

        }
    }
    public void test1(String a){
        System.out.println("a = " + a);
    }
     public void test1(String a){
        System.out.println("a = " + a);
    }
}
