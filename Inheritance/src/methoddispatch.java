class phone{
    public phone(){
        System.out.println("I am in phone");
    }
    public void onmethod(){
        System.out.println("on method function phone");
    }
}
class smartphone extends phone{
    public smartphone(){
        System.out.println("I am in smartphone");
    }
    public void onmethod(){
        System.out.println("on method function in smartphone");
    }
    public void music(){
        System.out.println("Music function");
    }
}
public class methoddispatch {
    public static void main(String[] args) {
        phone ph = new smartphone();
        ph.onmethod();
//        ph.music(); ->not allowed
    }
}
