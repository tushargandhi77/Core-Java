class rectangle{
    public int len;
    public int bred;
    rectangle(int len,int bred){
        this.len = len;
        this.bred = bred;
    }
    public int area(){
        return this.len*this.bred;
    }
}
class cuboid extends rectangle{
    int height;
    cuboid(int len,int bred,int height){
        super(len,bred);
        this.height = height;
    }
    public int volume(){
        return this.len*this.bred*this.height;
    }
}
public class problem2 {
    public static void main(String[] args) {
        cuboid ch = new cuboid(2,4,2);
        System.out.println(ch.volume());
    }
}
