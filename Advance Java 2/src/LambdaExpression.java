interface DemoAno1{
    void meth1(int a);
}
//class Harryfunc implements DemoAno1{
//    public void meth1(){
//        System.out.println("This is method 1");
//    }
//}

public class LambdaExpression {

    public static void main(String[] args) {
//    Harryfunc obj = new Harryfunc();
//    obj.meth1();

        // lambda Expression
        DemoAno1 obj = (a)->{
            System.out.println("I am method 1from this lambda: "+a);
        };
        obj.meth1(3);
    }
}
