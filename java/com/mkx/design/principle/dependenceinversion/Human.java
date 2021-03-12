package com.mkx.design.principle.dependenceinversion;

/**
 * 符合依赖倒置原则的写法，面向抽象编程，不需要修改底层的Human类
 */
public class Human {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studyCourse(Course course) {
        course.studyCourse();
    }

    public void studyCourse() {
        this.course.studyCourse();
    }
}
