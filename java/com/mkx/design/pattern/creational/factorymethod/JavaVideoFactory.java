package com.mkx.design.pattern.creational.factorymethod;

/**
 * 由子类去实现VideoFactory，由具体的工厂子类创建对象。
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
