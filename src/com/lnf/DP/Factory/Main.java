package com.lnf.DP.Factory;

public class Main {
    public  static  void main (String[] args){

        FactoryBMW320 bwm320 = new FactoryBMW320();
         BMW320  bwm32001=bwm320.createBMW();

        FactoryBMW523 bwm523 = new FactoryBMW523();
          BMW523  bwm52301=bwm523.createBMW();

    }
}
