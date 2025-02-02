package JavaObjectOrientedPrograming;

public class Bicycle {
    int gear;
    int speed;
    String color;
    public static int NumberOfBicycle = 0;

    void changeColor(String color ) {
        this.color = color;
        System.out.println("Color is changed to "+ this.color);
        NumberOfBicycle = 1;
    }
    void ChnageGear(int gear){
        this.gear = gear;
    }

    void getCurrentSpeed(int speed){
        this.speed = speed;
        NumberOfBicycle +=3;
        System.out.println("Number of bicycle is "+ NumberOfBicycle);
    }
}
