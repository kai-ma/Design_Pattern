package com.mkx.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by geely
 */
public class Father {
//    public void doSomething(Map map){
//        System.out.println("父类被执行");
//    }

    public void doSomething(HashMap map){
        System.out.println("父类被执行");
    }
}