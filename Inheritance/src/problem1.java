import com.sun.security.jgss.GSSUtil;

class circle{

    public int radius;
    circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int radius,int height){
        super(radius);
        this.height = height;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class problem1 {
    public static void main(String[] args) {
        cylinder c = new cylinder(4,10);
        System.out.println("The volume of cylinder");
        System.out.println(c.volume());
    }
}
