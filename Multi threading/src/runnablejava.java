class MyThreadRunnable1 implements Runnable{
    int i=1;
    public void run(){
        while(i!=1000) {
            System.out.println("I am a thread 1 not a thread 2");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    int i = 1;
    public void run(){
    while(i!=1000) {
        System.out.println("I am a thread 2 not a thread 1");
        i++;
    }
    }
}
public class runnablejava {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
