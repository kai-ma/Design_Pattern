package com.mkx.design.principle.interfacesegregation;

/**
 * 通过实现多个接口来实现多个功能
 */
public class Dog implements ISwimAnimalAction,IEatAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
