package JavaObjectOrientedPrograming;

public class exampleStaticBlock {
    static int x = 0;
    static int y = 0;
    static {
         x = 10;
         y = 20;
    }
    void add(){
        int add = x + y;
        System.out.println("Addition is "+add);
    }
}
