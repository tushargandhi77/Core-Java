interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth1");
    }
    public void meth4(){
        System.out.println("meth1");
    }
}
public class interface2 {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
    }
}
