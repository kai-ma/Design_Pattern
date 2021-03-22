package com.mkx.design.pattern.creational.factorymethod;

/**
 * 实际生产出来的产品JavaVideo
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
