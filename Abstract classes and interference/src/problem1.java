import com.sun.security.jgss.GSSUtil;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNip(){
        System.out.println("changing the nip");
    }
}
public class problem1 {
    public static void main(String[] args) {
        fountainPen f = new fountainPen();
        f.refill();
    }
}
