package Facade.Controller;

public interface API {

    public static API createAPI(String Type){
        if(Type.equals("Dev")){
            return new API_Dev();
        }
        else if(Type.equals("Prod")){
            return new API_Prod();
        }
        return null;
    }

    void m1();
    void m2();
    void m3();

}
