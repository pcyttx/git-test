package com.company;

public class ManJian implements HuoDong {
    @Override
    public double resultHuo(double money) {
        //满300-30
        if (money>=300){
            return money-30;
        }
        return money;
    }
}
