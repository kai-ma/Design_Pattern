package com.mkx.design.principle.singleresponsibility;

/**
 * 不遵循单一职责原则，再传来一些特殊的鸟类，mainMoveMode()方法需要继续扩展。
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
