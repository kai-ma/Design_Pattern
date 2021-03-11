package com.mkx.design.principle.openclose;

/**
 * @author kai-ma
 */
public class Test {
    public static void main(String[] args) {
        Course course = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) course;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName()
                + " 课程原价:" + javaCourse.getOriginalPrice() + "元 课程折后价格:" + javaCourse.getPrice() + "元");
    }
}
