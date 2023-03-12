class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank "+ this.getName());
    }
}
public class ThreadPeriority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Tushar1");
        MyThr1 t2 = new MyThr1("Tushar2");
        MyThr1 t3 = new MyThr1("Tushar3");
        MyThr1 t4 = new MyThr1("Tushar4");
        MyThr1 t5 = new MyThr1("Tushar5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
