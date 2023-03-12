import java.util.HashSet;

public class HashingT {
    public static void main(String[] args) {
        // f(x) = x%10
        HashSet<Integer> myHashSet = new HashSet<>(100,0.5f);
        myHashSet.add(3);
        myHashSet.add(13);
        myHashSet.add(33);
        myHashSet.add(43);
        myHashSet.add(53);
        System.out.println(myHashSet);
    }
}
