package com.lnf.DP.bulider;

public class Director {
    private builder builder = new ConcreteBuilder();

    public Product getAProduct(){
        builder.setPart("宝马汽车","X7");
        return builder.getProduct();
    }

    public Product getBProduct(){
        builder.setPart("奥迪汽车","Q5");
        return builder.getProduct();
    }
}