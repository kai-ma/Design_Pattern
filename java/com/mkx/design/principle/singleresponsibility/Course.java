package com.mkx.design.principle.singleresponsibility;

/**
 * 退课程会影响获取课程内容，退了课程就获取不到课程内容。所以这两个职责是有互相影响的，不满足单一职责原则。
    */
public interface Course {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();

}
