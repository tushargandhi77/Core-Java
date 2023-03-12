import com.sun.security.jgss.GSSUtil;

abstract class parent{
    public parent(){
        System.out.println("mai abstract constructor hoon");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class child1 extends parent {
    public void good() {
        System.out.println("Good evening");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        child c = new child();
    }
}