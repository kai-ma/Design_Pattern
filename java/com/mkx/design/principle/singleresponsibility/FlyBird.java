package com.mkx.design.principle.singleresponsibility;

/**
 * 直接将鸟类细分出WalkBird和FlyBird。
 */
public class FlyBird {
    public void mainMoveMode(String birdName) {
        System.out.println(birdName + "用翅膀飞");
    }
}
