package LLD_TwoSOLID.v1;

public class penguin extends Bird {
    @Override
    public void fly(){
        System.out.println( "Penguin can fly");
        // This method is worg and voilating OCP and liskosves principle
    }

    @Override
    public void makeSound(){
        System.out.println( "Penguin can make sound");
    }
}
