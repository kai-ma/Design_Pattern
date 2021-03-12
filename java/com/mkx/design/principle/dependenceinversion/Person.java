package com.mkx.design.principle.dependenceinversion;

/**
 * 不符合依赖倒置原则的写法，面向实现类编程，底层类Person需要经常修改
 */
public class Person {
    public void studyJavaCourse() {
        System.out.println("学习Java");
    }

    public void studyPythonCourse() {
        System.out.println("学习Python");
    }

    public void studyGolangCourse() {
        System.out.println("学习Golang");
    }
}
