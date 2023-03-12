interface camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("record in 4k");
    }
}

interface wifi2{
    String [] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone2{
    void CallNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone2 extends MyCellPhone implements wifi2,camera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking video");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry","Prethan","Anjali"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class polymorphism {
    public static void main(String[] args) {
    camera2 cam1 = new MySmartPhone2(); // -> This is a smartphone but use as a camera
    cam1.record4kVideo();
    cam1.takeSnap();
    }
}
