class MyThread11 extends Thread{
    public void run(){
        int i =0;
        while(i<1000) {
            System.out.println("I am cooking thread1 is running");
            i++;
        }
    }
}
class MyThread22 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am chatting thread2 is running");
            i++;
        }
    }
}
public class ThreadMethod
{
    public static void main(String[] args) {
        MyThread11 t1 = new MyThread11();
        MyThread22 t2 = new MyThread22();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
