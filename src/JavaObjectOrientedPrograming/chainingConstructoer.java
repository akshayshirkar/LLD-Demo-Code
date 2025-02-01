package JavaObjectOrientedPrograming;

public class chainingConstructoer {
    public chainingConstructoer(){
        this(1,2);
        System.out.println("No Argeumnt constrictor is called");
    }
    public chainingConstructoer(int a,int b){
        this(1,2,3,3);
        System.out.println("Constructoer with a b argument is called");
    }
    public chainingConstructoer(int a,int b,int c,int d){
        System.out.println("Constructor with a b c d arogemnts is called");
    }

}
