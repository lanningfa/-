package com.lnf.DP.bulider;

public class ConcreteBuilder extends builder {

    private Product product = new Product();

    public Product getProduct() {

        return product;
    }

    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }
}
