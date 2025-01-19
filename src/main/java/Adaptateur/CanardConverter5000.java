package Adaptateur;

public class CanardConverter5000 implements Canard{
    private Dindon adaptee=new Dindon();

    public void doCoinCoin() {
        this.adaptee.glapglap();
    }
    public void voler() {
        this.adaptee.moveOn();
    }
    public void nager() {
        this.adaptee.drown();
    }
}
