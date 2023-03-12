

class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends Base{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        derived d = new derived();
        d.setX(4);
        System.out.println(d.getX());
    }
}