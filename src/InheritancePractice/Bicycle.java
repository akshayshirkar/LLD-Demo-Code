package InheritancePractice;

public class Bicycle {
    public int price;
    public String color;
    private String ownerName;
    public Bicycle(int price, String color){
        this.price = price;
        this.color = color;
    }
    public void setColor(){
        System.out.println("Setting the color "+color);
    }
    public void getPrice(){
        System.out.println("Setting price for the bicycle "+price);
    }
    public void printDescription(){
        System.out.println("The description of the bicycle "+color+"Price is "+price);
    }
}
