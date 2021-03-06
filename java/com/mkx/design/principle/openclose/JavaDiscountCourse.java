package com.mkx.design.principle.openclose;

/**
 * @author kai-ma
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginalPrice() {
        return super.getPrice() * 0.8;
    }
}
