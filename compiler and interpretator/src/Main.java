//import java.util.Scanner;
// import java.util.*;
// Access modifier
class c1{
    public int x = 5;
    protected int y = 45;
    int z = 3;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        c1 c = new c1();
//        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);
    }
}