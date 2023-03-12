class myd{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
public class problem2 {
    public static void main(String[] args) {
        myd d = new myd();
        d.meth1();
    }
}
