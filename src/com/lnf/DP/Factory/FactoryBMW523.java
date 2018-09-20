package com.lnf.DP.Factory;

public class FactoryBMW523 implements BMWFactory {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }
}