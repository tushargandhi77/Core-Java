import com.sun.security.jgss.GSSUtil;

class cylinder{
    private int radius;
    private int height;

    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}
public class probem1 {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setHeight(4);
        c.setRadius(9);
        int r = c.getRadius();
        int h = c.getHeight();
        System.out.println(r);
        System.out.println(h);
        System.out.println(c.volume());
    }
}
