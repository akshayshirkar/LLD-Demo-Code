package LLD_TwoSOLID;

public class valture extends Bird implements Flyable  {
    public void getLocation(){
        System.out.println("Get location");
    }

    @Override
    public void fly() {
        System.out.println("Valture flying");
    }
}
