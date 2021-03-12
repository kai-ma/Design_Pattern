package com.mkx.design.principle.dependenceinversion;

public class Test {
//    1. 不符合依赖倒置原则的写法，面向实现类编程，底层类Person需要经常修改
//    public static void main(String[] args) {
//        Person tom = new Person();
//        tom.studyGolangCourse();
//        tom.studyJavaCourse();
//    }


    public static void main(String[] args) {
        //2. 符合依赖倒置原则的写法，构造方法Setter
        Human human = new Human();
        human.studyCourse(new JavaCourse());
        human.studyCourse(new PythonCourse());

        //3. 符合依赖倒置原则的写法，构造方法Setter
        Human tom = new Human();
        tom.setCourse(new JavaCourse());
        tom.studyCourse();
        tom.setCourse(new PythonCourse());
        tom.studyCourse();
    }
}
