package Facade.Controller;
import Facade.Model.*;

public class API_Prod implements API{
    private ClassA objetA;
    private ClassB objetB;
    private ClassC objetC;



    public API_Prod(){
        objetA = new ClassA();
        objetB = new ClassB();
        objetC = new ClassC();
    }

    public void m1(){
        objetA.M1();
    }
    public void m2(){
        objetB.M2();
    }
    public void m3(){
        objetC.M3();
    }
}
