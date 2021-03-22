package com.mkx.design.pattern.creational.factorymethod;

/**
 * 实际生产出来的产品PythonVideo
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
