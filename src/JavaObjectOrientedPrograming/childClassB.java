package JavaObjectOrientedPrograming;

public class childClassB extends superClassA{
    public childClassB(){
        System.out.println("childClassB constuctor is invoked");
    }
    @Override
    void add(int x, int y) {
        super.add(x, y);
    }
    void multiplication(int x,int y){
        int multiplication = x*y;
        System.out.println("Multiplication is "+multiplication);
    }
}
