package com.mkx.design.principle.liskovsubstitution.methodinput;


import java.util.TreeMap;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        TreeMap hashMap = new TreeMap();
        child.doSomething(hashMap);
    }
}
