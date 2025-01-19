package Adaptateur;

public class CanardConverter3000 extends Dindon implements Canard{
    public void doCoinCoin() {
        this.glapglap();
    }
    public void voler() {
        this.moveOn();
    }
    public void nager() {
        this.drown();
    }

}
