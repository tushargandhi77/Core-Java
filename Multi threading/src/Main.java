class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while(i<1000) {
            System.out.println("I am cooking thread1 is running");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am chatting thread2 is running");
            i++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}