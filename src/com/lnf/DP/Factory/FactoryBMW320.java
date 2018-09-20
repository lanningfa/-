package com.lnf.DP.Factory;

public class FactoryBMW320 implements BMWFactory{


    public BMW320 createBMW() {

        return new BMW320();
    }

}