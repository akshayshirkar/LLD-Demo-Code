package LLD_TwoSOLID;

import LLD_TwoSOLID.v0.Bird;

public class valture extends Bird implements Flyable  {
    public void getLocation(){
        System.out.println("Get location");
    }

    @Override
    public void fly() {
        System.out.println("Valture flying");
    }
}
