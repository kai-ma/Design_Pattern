package com.mkx.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Father {
//    @Override
//    public void doSomething(HashMap map) {
//        System.out.println("子类被执行");
//    }

    public void doSomething(Map map) {
        System.out.println("子类被执行");
    }
}
