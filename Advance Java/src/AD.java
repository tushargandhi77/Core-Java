
import java.util.ArrayDeque;

public class AD {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(33);

        ad1.addFirst(5);
        ad1.addLast(99);
        System.out.println(ad1);
//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getLast());
//        System.out.println(ad1.removeFirst());
      }
}

