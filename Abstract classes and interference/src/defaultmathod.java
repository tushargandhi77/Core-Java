interface camera{
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
interface wifi{
    String [] getNetworks();
    void connectNetwork(String network);
}
class MyCellPhone{
    void CallNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements wifi,camera{
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
public class defaultmathod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        String [] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
