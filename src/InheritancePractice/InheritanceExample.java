package InheritancePractice;

public class InheritanceExample {
    public int price;
    public String color;

    public InheritanceExample(){
        System.out.println("Constructing a new instance of InheritanceExample");
    }

    public void printPrice(int price){
        System.out.println("The price of " + color + " is " + price);
    }

    public void printColor(String color){
        System.out.println("The color of " + color + " is " + color);
    }
}
