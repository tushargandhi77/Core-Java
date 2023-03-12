import java.util.ArrayList;
import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList <>();
        ArrayList<Integer> l2 = new ArrayList <>(5);
        l2.add(88);
        l2.add(323);
        l2.add(332);
        l1.add(4);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.addAll(0,l2);
        l1.addFirst(999);
        l1.addLast(3333);
//        System.out.println(l1.contains(88));
//        System.out.println(l1.indexOf(4));
//        System.out.println(l1.lastIndexOf(4));


        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
//        System.out.println(l1);
    }
}
