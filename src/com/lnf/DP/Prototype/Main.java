package com.lnf.DP.Prototype;

public class Main {

        public static void main(String[] args){
            PrototypeImpl pi = new PrototypeImpl();

                PrototypeImpl clonepi = (PrototypeImpl)pi.clone();

                clonepi.show();

        }

    }
