package JavaObjectOrientedPrograming;

public class Bicycle {
    int gear;
    int speed;
    String color;

    void changeColor(String color ) {
        this.color = color;
        System.out.println("Color is changed to "+ this.color);
    }
    void ChnageGear(int gear){
        this.gear = gear;
    }

    void getCurrentSpeed(int speed){
        this.speed = speed;
    }
}
