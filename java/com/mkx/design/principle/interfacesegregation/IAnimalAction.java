package com.mkx.design.principle.interfacesegregation;

/**
 * 对于Dog来说，如果实现这个接口，狗不会飞，也就是说必须有一个空实现放在class Dog当中。
 * 这不满足接口隔离原则。
 * 对于Bird来说，如果实现这个接口，很多鸟不会游泳，鸵鸟也不会飞。
 */
public interface IAnimalAction {
    void eat();

    void fly();

    void swim();

}
