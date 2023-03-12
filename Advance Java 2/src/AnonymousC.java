interface DemoAno{
    void meth1();
    void meth2();
}
//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//    public void meth1(){
//        System.out.println("I am meth1");
//    }
//    public void meth2(){
//        System.out.println("I am meth2");
//    }
//}
public class AnonymousC {

    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();

        // Anonymous class
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        obj.meth1();
    }
}

