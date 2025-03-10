package SingletonExample;

public class dBConnection {
    private static dBConnection instance = null;;
    private dBConnection(){

    }
    public static dBConnection getInstance(){
        if(instance == null){
            instance = new dBConnection();;
        }
        return instance;
    }
}
