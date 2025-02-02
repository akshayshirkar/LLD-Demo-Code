package JavaObjectOrientedPrograming;

public class calculator implements calclutaionPlus {
    @Override
    public void doaddtion(int x, int y) {
        int addition = x + y;
        System.out.println("Addirion is "+addition);
    }
    @Override
    public void doManupulation(int x,int y){
        int manupliation = x*y;
        System.out.println("Manuplulation is "+manupliation);
    }
}
