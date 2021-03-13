package com.mkx.design.principle.interfacesegregation;

/**
 * 对于Bird来说，如果实现这个接口，很多鸟不会游泳，鸵鸟也不会飞。这些方法得空着
 */
public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
