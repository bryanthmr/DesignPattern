package Singleton.View;

import Singleton.SingleAPI;

public class ViewA {
    private ViewA(){
        System.out.println("ViewA: Constructor");
    }
    public static void MA(){
        SingleAPI api=SingleAPI.getInstance();
        System.out.println("ViewA: Attribut API --> "+api.attribut);
        api.setAttribut("attribut modifié par ViewA");

    }
}
