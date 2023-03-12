interface Bicycle{
    int a = 45;
    void applybreak(int decrement);
    void speedup(int increment);
}

class Avoncycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee pee poo");
    }
    public void applybreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedup(int increment){
        System.out.println("Applying speed");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Avoncycle ah = new Avoncycle();
        ah.applybreak(1);
        System.out.println(ah.a);
    }
}
