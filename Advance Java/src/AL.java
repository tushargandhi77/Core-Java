import java.util.*;
public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList < >();
        ArrayList<Integer> l2 = new ArrayList < >(5);
        l2.add(88);
        l2.add(323);
        l2.add(332);
        l1.add(4);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.addAll(0,l2);

        // Indexing and
        System.out.println(l1.contains(88));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(4));

        // Set and Remove
//        l1.set(2,333);
//        System.out.println(l1.remove(1));
//        remove(index)

//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }



//            Scanner sc = new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            l1.add(i,sc.nextInt());
//        }
//        for(int i=0;i<5;i++){
//            System.out.println(l1.get(i));
//        }

    }
}
