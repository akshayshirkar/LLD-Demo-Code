package InheritancePractice;

public class Feature extends Bicycle {
    public int numberOfGear;
    public int price;
    public int color;
    public Feature(int numberOfGear, int price, String color) {
        super(price,
                color);
        this.numberOfGear = numberOfGear;
    }

    public void setGear(){
        System.out.println("Setting gear for "+numberOfGear);
    }
    @Override
    public void setColor() {
        super.setColor();
        System.out.println("This method is updated method for the setColor");
    }
}
