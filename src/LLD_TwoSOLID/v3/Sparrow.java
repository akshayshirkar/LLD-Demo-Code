package LLD_TwoSOLID.v3;

public class Sparrow extends Bird implements flyable {
    public void fly(){
        System.out.println("Sparrow is flying");
    }
    @Override
    public void eat(){
        System.out.println("Sparrow is eating");
    }
}
