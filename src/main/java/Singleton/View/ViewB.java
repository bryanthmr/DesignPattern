package Singleton.View;

import Singleton.SingleAPI;

public class ViewB {
    private ViewB(){
        System.out.println("ViewB: Constructor");
    }
    public static void MB(){
        SingleAPI api=SingleAPI.getInstance();
        System.out.println("ViewB: attribut API --> "+api.attribut);
        api.setAttribut("attribut modifié par ViewB");
    }
}
