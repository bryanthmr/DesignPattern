package Singleton.View;

import Singleton.SingleAPI;

public class ViewC {
    private ViewC(){
        System.out.println("ViewC: Constructor");
    }
    public static void MC(){
        SingleAPI api=SingleAPI.getInstance();
        System.out.println("ViewC: Attribut API --> "+api.attribut);
        api.setAttribut("attribut modifié par ViewC");
    }
}
