import java.util.ArrayList;
import java.util.Scanner;
class generics<T1>{
    int val;
    private T1 t1;

//    public void setVal(int val) {
//        this.val = val;
//    }
//
//    public void setT1(T1 t1) {
//        this.t1 = t1;
//    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public generics(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }
}
public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));
        int a = arrayList.get(1);

        generics<String> g1 = new generics<>(23,"My string is my string");
        String str = g1.getT1();
        System.out.println(str);
    }
}
