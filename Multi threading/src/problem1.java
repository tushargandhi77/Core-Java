class practice1 extends Thread{
    public void run(){
        int i =0;
        while(i<1000) {
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good morning");
            i++;
        }
    }
}
class practice2 extends Thread{
    public void run(){
        int i =0;
        while(i<1000) {
//            try{
//                Thread.sleep(400);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("welcome");
            i++;
        }
    }
}

public class problem1
{
    public static void main(String[] args) {
        practice1 p1 = new practice1();
        practice2 p2 = new practice2();
        p1.setPriority(6);
        p2.setPriority(9);
        p1.start();
        p2.start();
    }
}
