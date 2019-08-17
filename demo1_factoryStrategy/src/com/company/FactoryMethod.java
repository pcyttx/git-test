package com.company;

public class FactoryMethod {
    private HuoDong huoDong;

    public FactoryMethod(HuoDong huoDong) {
        super();
        this.huoDong = huoDong;
    }

    public HuoDong getHuoDong(String type){
        switch (type){
            case "满减":
                huoDong= new ManJian();
                break;
            case "打折":
                huoDong=new DaZhe();
                break;
            default:
                huoDong= new Nomal();
                break;
        }
        return huoDong;
    }

}
