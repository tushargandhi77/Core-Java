class Base2{
    public Base2(){
        System.out.println("I am in base2 class constructor");
    }
}
class derived2 extends Base2{
    public derived2(){
        System.out.println("I am in derived2 class constructor");
    }
}
public class functionoverridding {
    public static void main(String[] args) {
        derived2 d = new derived2();
    }
}
