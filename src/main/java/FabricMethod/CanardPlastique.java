package FabricMethod;

public interface CanardPlastique {

    static CanardPlastique createCanard(String type) {
        switch (type) {
            case "Colvert":
                return new ColvertPlastique();
            case "Jaune":
                return new CanardJaunePlastique();
            default:
                return null;
        }
    }

    void doCoinCoin();
    void voler();
    void nager();
}
