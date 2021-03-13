package com.mkx.design.principle.singleresponsibility;

/**
 * Created by geely
 */
public class Method {
    //不好，命名不明确，修改了多项属性。
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
//        address = "beijing";
    }

    //好，命名明确，单一职责。
    private void updateUsername(String userName) {
        userName = "geely";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    //不推荐这种写法，从命名上就不明确。
    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }


        userName = "geely";
        address = "beijing";
    }


}
