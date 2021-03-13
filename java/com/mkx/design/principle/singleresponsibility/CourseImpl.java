package com.mkx.design.principle.singleresponsibility;

/**
 * 可以实现多个接口，组合出实现类具体实现。
 */
public class CourseImpl implements CourseManager, CourseContent {
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
