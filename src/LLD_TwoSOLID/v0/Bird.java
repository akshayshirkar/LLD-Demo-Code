package LLD_TwoSOLID.v0;

public class Bird {
    String birdType;
    public void eat() {
        System.out.println("bird can eat");
    }
    public void fly(){
        if(birdType == "sparrow"){
            System.out.println("sparrow can fly");
        }else if(birdType == "parrot"){
        }else{
            System.out.println("bird can't fly");
        }
    }
    public void dance(){
        if(birdType == "sparrow") {
            System.out.println("sparrow can dance");
        }else if(birdType == "parrot"){
            System.out.println("parrot can dance");
        }else{
            System.out.println( "bird can't dance");
        }
    }
}

// We are voileting single reponsiblity principle here